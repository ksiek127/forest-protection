from flask import Flask, jsonify, request
import json

app = Flask(__name__)

@app.route('/', methods=['GET'])
def home():
    info = "./map<br>" \
           "./sector"
    return info

@app.route('/map', methods=['GET'])
def map_view():
    directory_path = '../../utils/json_maps/filled_100x100.json' # TODO probably changed when we create some databases
    with open(directory_path) as file:
        return json.load(file)
    # name = request.args.get('forest_name')

@app.route('/sector', methods=['GET'])
def sector_view():
    directory_path = '../../utils/json_maps/filled_100x100.json'  # TODO probably changed when we create some databases
    with open(directory_path) as file:
        name = request.args.get('sector_name')
        sectors = json.load(file)["sectors"]
        for sector in sectors:
            if sector['sector_name'] == name:
                return sector
    # name = request.args.get('forest_name')
    # sector_name = request.args.get('forest_name')

if __name__ == '__main__':
    app.run(debug=True)