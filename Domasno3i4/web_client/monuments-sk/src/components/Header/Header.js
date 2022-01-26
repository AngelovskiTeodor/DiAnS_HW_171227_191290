import "./Header.css";
import Container from "react-bootstrap/Container";
import Row from "react-bootstrap/Row";
import Col from "react-bootstrap/Col";

function Header() {
  return (
    <Container>
      <Row className="justify-content-md-center">
        <Col>
          <h1 className="title-logo">Monuments</h1>
        </Col>
      </Row>
    </Container>
  );
}

export default Header;
