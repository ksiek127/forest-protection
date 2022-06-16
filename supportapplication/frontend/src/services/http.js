const serverUrl = "http://localhost:8080";

function optionsObjectToString(options) {
    if (!options) return "";

    let optionsString;

    Object.entries(options).forEach((value) => {
        if (!optionsString) optionsString = `?${value[0]}=${value[1]}`;
        else optionsString += `&${value[0]}=${value[1]}`;
    });

    return optionsString;
}

async function proccesResponse(response, toastComunicat) {
    if (response.ok) {
        toast.success(`${toastComunicat}`);
        var data;
        try{
            data = await response.json();
        }
        catch(e){
            console.error(e);
            data = [];
        }
        return {
            ok: true,
            data: data
        };
    } else {
        const text = await response.json();
        toast.error(`${toastComunicat} \n ${text}`);
        return {
            ok: false,
            data: text
        };
    }
}

const get = async (path, options) => {
    const response = await fetch(serverUrl + path + optionsObjectToString(options), {
        method: "GET",
        headers: {
            "Content-Type": "application/json",
            Accept: "application/json"
        }
    });
    return await proccesResponse(response, "GET " + path);
};

const post = async (path, body) => {
    const response = await fetch(serverUrl + path, {
        method: "POST",
        body: JSON.stringify(body),
        headers: {
            "Content-Type": "application/json",
            Accept: "application/json"
        }
    });
    return await proccesResponse(response, "POST " + path);
};