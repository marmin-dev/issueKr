import { useEffect, useState } from "react";
import { Map, MapMarker } from "react-kakao-maps-sdk";
import { AllApiMapHandler } from "../apihandler/HomeApiHandler";
import Header from "../components/Header";

const Homepage = () => {
  const [pings, setPings] = useState([]);

  useEffect(() => {
    apiHandle();
  }, []);
  const apiHandle = async () => {
    const response = await AllApiMapHandler();
    console.log(response);
    setPings(response);
  };
  return (
    <>
      <Header />
      <Map // 지도를 표시할 Container
        center={{
          // 지도의 중심좌표
          lat: 36.84254655866462,
          lng: 127.83653068080238,
        }}
        style={{
          // 지도의 크기
          width: "100%",
          height: "450px",
        }}
        level={20} // 지도의 확대 레벨
      >
        {pings.map((ping) => (
          <MapMarker
            key={ping.id} // 마커를 생성합니다
            position={{
              // 마커가 표시될 위치입니다
              lat: ping.lat,
              lng: ping.lng,
            }}
          ></MapMarker>
        ))}
      </Map>
    </>
  );
};

export default Homepage;
