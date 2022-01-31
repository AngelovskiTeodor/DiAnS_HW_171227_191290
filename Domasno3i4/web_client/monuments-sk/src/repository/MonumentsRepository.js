import axios from "axios";
import { MonumentsServiceEndpoint } from "../api-endpoints";

const MonumentsService = {
    getMonumentsList: () => {
        return axios.get(
            MonumentsServiceEndpoint,
            { headers: {"Access-Control-Allow-Origin": "*"} },
          // ).then(
          //   resp => {
          //     console.log(resp.data);
          //     return resp.data;
          //   }
          // ).catch(
          //   err => console.log("Error api get request monumentsList: " + err)
        );
    },
    
    getMonument: (id) => {
        return axios.get(
            MonumentsServiceEndpoint,
            { "id": id },
            { headers: {"Access-Control-Allow-Origin": "*"} },
          // ).then(
          //   resp => {
          //     console.log(resp.data);
          //     return resp.data;
          //   }
          // ).catch(
          //   err => console.log("Error api get request monument: " + err)
        );
    }
}

export default MonumentsService