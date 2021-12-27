import Container from "react-bootstrap/Container";
import Row from "react-bootstrap/Row";
import Col from "react-bootstrap/Col";
import GoogleMapReact from "google-map-react";
import { useState } from "react";
import MonumentMarker from "../MonumentMarker/MonumentMarker";
import axios from "axios";
import useGeolocation from 'react-hook-geolocation'
import { useSelector, useDispatch } from 'react-redux'
import { setLocation } from '../../features/coordinates/coordinatesSlice'
//import monumentsInstance from "../../configs/axios/monumentsInstance";

function Map() {

  const [center, setCenter] = useState({
    lat: 41.99646,
    lng: 21.43141
  });
  const [zoom, setZoom] = useState(11);
  const [apiKey] = useState("AIzaSyAt4BPLvokss17_FseI9mvp8oPfw7sDLJM");
  const [monumentsList, setMonumentsList] = useState(
    axios.get(
      'http://localhost:9091/api/monuments/',
      function (req, res) {
        req.header("Access-Control-Allow-Origin", "*");
        res.header("Access-Control-Allow-Origin", "*");
    }
    ).then(
      resp => {
        console.log(resp.data);
        setMonumentsList(resp.data);
        return resp.data;
      }
    ).catch(
      err => console.log("Error api request monuments: " + err)
    )
  );

  const count = useSelector((state) => state.coordinates.value)
  const dispatch = useDispatch()

  function monuments() {
  }

  function useLocation() {
    let location = useGeolocation();
    if (!location.error) {
      console.log(location);
      //dispatch(setLocation({payload: {lat: location.latitude,lon: location.longitude}}))
      return (
        <MonumentMarker name="My location" lat={location.latitude} lng={location.longitude} />
      );
    }
    else {
      alert("GPS Unavailable");
      return (
        <div></div>
      );
    }
    return (
      <div></div>
    );
  }

  return (
    <Container>
      <Row className="justify-content-md-center">
        <Col>
          <div style={{ height: '90vh', width: '95%', margin: 'auto'}}>
            <GoogleMapReact 
              bootstrapURLKeys={{key: apiKey}}
              defaultCenter={center}
              defaultZoom={zoom}
            >
              {/* {monuments()} */}
              {useLocation()}
              <MonumentMarker name="test" lat="0" lng="0" />
            </GoogleMapReact>
          </div>
        </Col>
      </Row>
    </Container>
    
  );
}

export default Map;
