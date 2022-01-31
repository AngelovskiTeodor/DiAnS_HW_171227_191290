import axios from "axios";
import { RouteFinderServiceEndpoint } from "../api-endpoints";

const RouteFinderService = {
    getRoute: (starting_lon, starting_lat, monumentId) => {
        return axios.post(
            RouteFinderServiceEndpoint,
            { "starting_lon": starting_lon, "starting_lat": starting_lat, "monumentId": monumentId },
            { headers: {"Access-Control-Allow-Origin": "*"} }
        );
    }
};

export default RouteFinderService;