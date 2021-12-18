import Container from "react-bootstrap/Container";
import Row from "react-bootstrap/Row";
import Col from "react-bootstrap/Col";
import Image from "react-bootstrap/Image";
import mockUpImg from "./Map.jpg";

function Map() {
  return (
    <Container>
      <Row className="justify-content-md-center">
        <Col>
          <img alt="map" src={mockUpImg} />
        </Col>
      </Row>
    </Container>
  );
}

export default Map;
