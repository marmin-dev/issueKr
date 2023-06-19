import axios from "axios";

export const AllApiMapHandler = async () => {
  // 전체 제목, 위도, 경도, id 불러오기
  try {
    const response = await axios.get(
      "http://localhost:8080/api/v1/issue/all/map"
    );
    console.log(response.data);
    return response.data;
  } catch (e) {
    console.log(e);
  }
};

export const TodayApiMapHandler = async () => {
  // 오늘 제목, 위도 경도, id 불러오기
  try {
    const response = await axios.get(
      "http://localhost:8080/api/v1/issue/today/map"
    );
    console.log(response.data);
    return response.data;
  } catch (e) {
    console.log(e);
  }
};

export const AllApiHandler = async () => {
  // 전체 정보 불러오기
  try {
    const response = await axios.get("http://localhost:8080/api/v1/issue/all");
    console.log(response.data);
    return response.data;
  } catch (e) {
    console.log(e);
  }
};

export const TodayApiHandler = async () => {
  // 오늘의 정보 불러오기
  try {
    const response = await axios.get(
      "http://localhost:8080/api/v1/issue/today"
    );
    console.log(response.data);
    return response.data;
  } catch (e) {
    console.log(e);
  }
};

export const DetailApiHandler = async (i) => {
  // 디테일 정보 불러오기
  try {
    const response = await axios.get(
      `http://localhost:8080/api/v1/issue/detail/${i}`
    );
    console.log(response.data);
    return response.data;
  } catch (e) {
    console.log(e);
  }
};

export const DeleteApiHandler = async (i) => {
  // 이슈 삭제하기
  try {
    const response = await axios.delete(
      `http://localhost:8080/api/v1/issue/delete/${i}`
    );
    console.log(response.data);
    return response.data;
  } catch (e) {
    console.log(e);
  }
};
