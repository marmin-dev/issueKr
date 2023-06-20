import { useEffect, useState } from "react";
import { MapMarker } from "react-kakao-maps-sdk";
import { Link } from "react-router-dom";
import { styled } from "styled-components";

const PingLink = styled(Link)`
  text-decoration: none;
  color: blue;
`;

const Ping = ({ ping, resetMarker, setResetMarker }) => {
  const [isMarkerClicked, setIsMarkerClicked] = useState(false);
  useEffect(() => {
    if (resetMarker === false) {
      setIsMarkerClicked(false);
    }
  });

  return (
    <MapMarker
      // 마커 위치
      position={{
        lat: ping.lat,
        lng: ping.lng,
      }}
      onClick={() => {
        setIsMarkerClicked(true);
        setResetMarker(true);
      }} // 마커 클릭시 상태 업데이트
    >
      {isMarkerClicked ? ( // isMarkerClicked 값에 따라 내용 보이기/숨기기
        <div>
          <p>{ping.title}</p>
          <PingLink>게시글 보기</PingLink>
        </div>
      ) : null}
    </MapMarker>
  );
};

export default Ping;
