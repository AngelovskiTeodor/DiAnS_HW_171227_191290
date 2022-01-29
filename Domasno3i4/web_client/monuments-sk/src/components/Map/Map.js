import Container from "react-bootstrap/Container";
import Row from "react-bootstrap/Row";
import Col from "react-bootstrap/Col";
import GoogleMapReact from "google-map-react";
import { useState } from "react";
import MapMarker from "../MapMarker/MapMarker";
import useGeolocation from "react-hook-geolocation";
import { GOOGLE_MAP_API_KEY } from "../../api-keys";
import MonumentsService from "../../repository/MonumentsRepository";

function Map() {
  const [center] = useState({
    lat: 41.99646,
    lng: 21.43141,
  });
  const [zoom] = useState(11);
  const [apiKey] = useState(GOOGLE_MAP_API_KEY);
  const [monumentsList, setMonumentsList] = useState(() => {
    return MonumentsService.getMonumentsList();
  });

  function useLocation() {
    let location = useGeolocation();
    if (!location.error) {
      console.log(location);
      return (
        <MapMarker
          name="My location"
          lat={location.latitude}
          lng={location.longitude}
        />
      );
    } else {
      alert("GPS Unavailable");
      return <div></div>;
    }
  }

  return (
    <Container>
      <Row className="justify-content-md-center">
        <Col>
          <div style={{ height: "90vh", width: "95%", margin: "auto" }}>
            <GoogleMapReact
              bootstrapURLKeys={{ key: apiKey }}
              defaultCenter={center}
              defaultZoom={zoom}
            >
              {useLocation()}
              <MapMarker name="test" lat="0" lng="0" />
            </GoogleMapReact>
          </div>
        </Col>
      </Row>
    </Container>
  );
}

export default Map;
