import GeoIconSVG from './GeoLocationIcon.svg'

function GeoLocationIcon () {
    return (
        <img 
            src={GeoIconSVG}
            alt="GPS Icon"
            style={{ height: 40, width: 40 }}
        />
    );
}

export default GeoLocationIcon;