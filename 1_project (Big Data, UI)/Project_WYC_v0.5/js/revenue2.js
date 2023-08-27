const cropSelect = document.querySelector(".wyc-select-crop");
const cropInfo = document.querySelector(".wyc-info-crop");
const cropMap = document.querySelector(".wyc-map");
//지역버튼
const boseong = document.querySelector(".wyc-boseong");
const damyang = document.querySelector(".wyc-damyang");
const gangjin = document.querySelector(".wyc-gangjin");
const goheung = document.querySelector(".wyc-goheung");
const gokseong = document.querySelector(".wyc-gokseong");
const gurye = document.querySelector(".wyc-gurye");
const gwangyang = document.querySelector(".wyc-gwangyang");
const haenam = document.querySelector(".wyc-haenam");
const hampyeng = document.querySelector(".wyc-hampyeng");
const hwasun = document.querySelector(".wyc-hwasun");
const jangheung = document.querySelector(".wyc-jangheung");
const jangseung = document.querySelector(".wyc-jangseung");
const jindo = document.querySelector(".wyc-jindo");
const mokpo = document.querySelector(".wyc-mokpo");
const muan = document.querySelector(".wyc-muan");
const naju = document.querySelector(".wyc-naju");
const sinan = document.querySelector(".wyc-sinan");
const suncheon = document.querySelector(".wyc-suncheon");
const wando = document.querySelector(".wyc-wando");
const yeongam = document.querySelector(".wyc-yeongam");
const yeonggwang = document.querySelector(".wyc-yeonggwang");
const yeosu = document.querySelector(".wyc-yeosu");
const areas = [
  boseong,
  damyang,
  gangjin,
  goheung,
  gokseong,
  gurye,
  gwangyang,
  haenam,
  hampyeng,
  hwasun,
  jangheung,
  jangseung,
  jindo,
  mokpo,
  muan,
  naju,
  sinan,
  suncheon,
  wando,
  yeongam,
  yeonggwang,
  yeosu,
];
//농작물 이름
const chives = document.querySelector(".chives");
const cucumber = document.querySelector(".cucumber");
const garlic = document.querySelector(".garlic");
const greenonion = document.querySelector(".greenonion");
const grape = document.querySelector(".grape");
const kiwi = document.querySelector(".kiwi");
const onion = document.querySelector(".onion");
const peach = document.querySelector(".peach");
const pepper = document.querySelector(".pepper");
const rice = document.querySelector(".rice");
const spinach = document.querySelector(".spinach");
const stberry = document.querySelector(".stberry");
const spotato = document.querySelector(".spotato");
const tomato = document.querySelector(".tomato");
const crops = [
  chives,
  cucumber,
  garlic,
  grape,
  greenonion,
  kiwi,
  onion,
  peach,
  pepper,
  rice,
  spinach,
  stberry,
  spotato,
  tomato,
];

//농작물 화이트보드 이름
const whiteBoardChives = document.querySelector(".white-board-chives");
const whiteBoardCucumber = document.querySelector(".white-board-cucumber");
const whiteBoardGarlic = document.querySelector(".white-board-garlic");
const whiteBoardGrape = document.querySelector(".white-board-grape");
const whiteBoardGreenonion = document.querySelector(".white-board-greenonion");
const whiteBoardKiwi = document.querySelector(".white-board-kiwi");
const whiteBoardPeach = document.querySelector(".white-board-peach");
const whiteBoardPepper = document.querySelector(".white-board-pepper");
const whiteBoardOnion = document.querySelector(".white-board-onion");
const whiteBoardRice = document.querySelector(".white-board-rice");
const whiteBoardSpinach = document.querySelector(".white-board-spinach");
const whiteBoardStberry = document.querySelector(".white-board-stberry");
const whiteBoardSpotato = document.querySelector(".white-board-spotato");
const whiteBoardTomato = document.querySelector(".white-board-tomato");
const whiteBoards = [
  whiteBoardChives,
  whiteBoardCucumber,
  whiteBoardGarlic,
  whiteBoardGrape,
  whiteBoardGreenonion,
  whiteBoardKiwi,
  whiteBoardOnion,
  whiteBoardPeach,
  whiteBoardPepper,
  whiteBoardRice,
  whiteBoardSpinach,
  whiteBoardSpotato,
  whiteBoardStberry,
  whiteBoardTomato,
];

//농작물 이름표시
const chivesText = document.querySelector(".chives-text");
const cucumberText = document.querySelector(".cucumber-text");
const garlicText = document.querySelector(".garlic-text");
const grapeText = document.querySelector(".grape-text");
const greenonionText = document.querySelector(".greenonion-text");
const kiwiText = document.querySelector(".kiwi-text");
const onionText = document.querySelector(".onion-text");
const peachText = document.querySelector(".peach-text");
const pepperText = document.querySelector(".pepper-text");
const riceText = document.querySelector(".rice-text");
const spinachText = document.querySelector(".spinach-text");
const stberryText = document.querySelector(".stberry-text");
const spotatoText = document.querySelector(".spotato-text");
const tomatoText = document.querySelector(".tomato-text");

//info up-down창
const info_up_chives = document.querySelector(".info-up-chives");
const info_down_chives = document.querySelector(".info-down-chives");
const info_up_cucumber = document.querySelector(".info-up-cucumber");
const info_down_cucumber = document.querySelector(".info-down-cucumber");
const info_up_garlic = document.querySelector(".info-up-garlic");
const info_down_garlic = document.querySelector(".info-down-garlic");
const info_up_grape = document.querySelector(".info-up-grape");
const info_down_grape = document.querySelector(".info-down-grape");
const info_up_greenonion = document.querySelector(".info-up-greenonion");
const info_down_greenonion = document.querySelector(".info-down-greenonion");
const info_up_kiwi = document.querySelector(".info-up-kiwi");
const info_down_kiwi = document.querySelector(".info-down-kiwi");
const info_up_onion = document.querySelector(".info-up-onion");
const info_down_onion = document.querySelector(".info-down-onion");
const info_up_peach = document.querySelector(".info-up-peach");
const info_down_peach = document.querySelector(".info-down-peach");
const info_up_pepper = document.querySelector(".info-up-pepper");
const info_down_pepper = document.querySelector(".info-down-pepper");
const info_up_rice = document.querySelector(".info-up-rice");
const info_down_rice = document.querySelector(".info-down-rice");
const info_up_spinach = document.querySelector(".info-up-spinach");
const info_down_spinach = document.querySelector(".info-down-spinach");
const info_up_stberry = document.querySelector(".info-up-stberry");
const info_down_stberry = document.querySelector(".info-down-stberry");
const info_up_spotato = document.querySelector(".info-up-spotato");
const info_down_spotato = document.querySelector(".info-down-spotato");
const info_up_tomato = document.querySelector(".info-up-tomato");
const info_down_tomato = document.querySelector(".info-down-tomato");
const infoUps = [
  info_up_chives,
  info_up_cucumber,
  info_up_garlic,
  info_up_grape,
  info_up_greenonion,
  info_up_kiwi,
  info_up_onion,
  info_up_peach,
  info_up_pepper,
  info_up_rice,
  info_up_spinach,
  info_up_stberry,
  info_up_spotato,
  info_up_tomato,
];
const infoDowns = [
  info_down_chives,
  info_down_cucumber,
  info_down_garlic,
  info_down_grape,
  info_down_greenonion,
  info_down_kiwi,
  info_down_onion,
  info_down_peach,
  info_down_pepper,
  info_down_rice,
  info_down_spinach,
  info_down_stberry,
  info_down_spotato,
  info_down_tomato,
];

//버튼
const btnSubmit = document.querySelector(".wyc-submit");
const btnReset = document.querySelector(".wyc-reset");
const btnCloseModal = document.querySelector("#close-modal2");

//모달컨테이너
const modalBox = document.querySelector("#modal-container2.modal-hidden2");

//모달수익그래프 칸
const modalChives = document.querySelector(".modal-chives");
const modalCucumber = document.querySelector(".modal-cucumber");
const modalGarlic = document.querySelector(".modal-garlic");
const modalGrape = document.querySelector(".modal-grape");
const modalGreenonion = document.querySelector(".modal-greenonion");
const modalKiwi = document.querySelector(".modal-kiwi");
const modalOnion = document.querySelector(".modal-onion");
const modalPeach = document.querySelector(".modal-peach");
const modalPepper = document.querySelector(".modal-pepper");
const modalRice = document.querySelector(".modal-rice");
const modalSpinach = document.querySelector(".modal-spinach");
const modalStberry = document.querySelector(".modal-stberry");
const modalSpotato = document.querySelector(".modal-spotato");
const modalTomato = document.querySelector(".modal-tomato");

const modals = [
  modalChives,
  modalCucumber,
  modalGarlic,
  modalGrape,
  modalGreenonion,
  modalKiwi,
  modalOnion,
  modalPeach,
  modalPepper,
  modalRice,
  modalSpinach,
  modalStberry,
  modalSpotato,
  modalTomato,
];

//머리말?
const sec2 = document.querySelector(".sec2");
const sec3 = document.querySelector(".sec3");

//지역버튼 클릭시
boseong.addEventListener("click", () => {
  for (let i = 0; i < crops.length; i++) {
    crops[i].style.display = "none";
  }
  cropSelect.style.display = "block";
  stberry.style.display = "block";
  kiwi.style.display = "block";
  onion.style.display = "block";
  sec2.style.display = "block";
  window.scrollTo(0, 1000, { behavior: "smooth" });
});
damyang.addEventListener("click", () => {
  for (let i = 0; i < crops.length; i++) {
    crops[i].style.display = "none";
  }
  cropSelect.style.display = "block";
  stberry.style.display = "block";
  grape.style.display = "block";
  tomato.style.display = "block";
  sec2.style.display = "block";
  window.scrollTo(0, 1000, { behavior: "smooth" });
});
gangjin.addEventListener("click", () => {
  for (let i = 0; i < crops.length; i++) {
    crops[i].style.display = "none";
  }
  cropSelect.style.display = "block";
  stberry.style.display = "block";
  chives.style.display = "block";
  cucumber.style.display = "block";
  sec2.style.display = "block";
  window.scrollTo(0, 1000, { behavior: "smooth" });
});
goheung.addEventListener("click", () => {
  for (let i = 0; i < crops.length; i++) {
    crops[i].style.display = "none";
  }
  cropSelect.style.display = "block";
  pepper.style.display = "block";
  rice.style.display = "block";
  garlic.style.display = "block";
  sec2.style.display = "block";
  window.scrollTo(0, 1000, { behavior: "smooth" });
});
gokseong.addEventListener("click", () => {
  for (let i = 0; i < crops.length; i++) {
    crops[i].style.display = "none";
  }
  cropSelect.style.display = "block";
  stberry.style.display = "block";
  kiwi.style.display = "block";
  spinach.style.display = "block";
  sec2.style.display = "block";
  window.scrollTo(0, 1000, { behavior: "smooth" });
});
gurye.addEventListener("click", () => {
  for (let i = 0; i < crops.length; i++) {
    crops[i].style.display = "none";
  }
  cropSelect.style.display = "block";
  cucumber.style.display = "block";
  chives.style.display = "block";
  greenonion.style.display = "block";
  sec2.style.display = "block";
  window.scrollTo(0, 1000, { behavior: "smooth" });
});
gwangyang.addEventListener("click", () => {
  for (let i = 0; i < crops.length; i++) {
    crops[i].style.display = "none";
  }
  cropSelect.style.display = "block";
  tomato.style.display = "block";
  chives.style.display = "block";
  peach.style.display = "block";
  sec2.style.display = "block";
  window.scrollTo(0, 1000, { behavior: "smooth" });
});
haenam.addEventListener("click", () => {
  for (let i = 0; i < crops.length; i++) {
    crops[i].style.display = "none";
  }
  cropSelect.style.display = "block";
  spotato.style.display = "block";
  rice.style.display = "block";
  greenonion.style.display = "block";
  sec2.style.display = "block";
  window.scrollTo(0, 1000, { behavior: "smooth" });
});
hampyeng.addEventListener("click", () => {
  for (let i = 0; i < crops.length; i++) {
    crops[i].style.display = "none";
  }
  cropSelect.style.display = "block";
  pepper.style.display = "block";
  garlic.style.display = "block";
  onion.style.display = "block";
  sec2.style.display = "block";
  window.scrollTo(0, 1000, { behavior: "smooth" });
});
hwasun.addEventListener("click", () => {
  for (let i = 0; i < crops.length; i++) {
    crops[i].style.display = "none";
  }
  cropSelect.style.display = "block";
  tomato.style.display = "block";
  rice.style.display = "block";
  peach.style.display = "block";
  sec2.style.display = "block";
  window.scrollTo(0, 1000, { behavior: "smooth" });
});
jangheung.addEventListener("click", () => {
  for (let i = 0; i < crops.length; i++) {
    crops[i].style.display = "none";
  }
  cropSelect.style.display = "block";
  stberry.style.display = "block";
  spinach.style.display = "block";
  peach.style.display = "block";
  sec2.style.display = "block";
  window.scrollTo(0, 1000, { behavior: "smooth" });
});
jangseung.addEventListener("click", () => {
  for (let i = 0; i < crops.length; i++) {
    crops[i].style.display = "none";
  }
  cropSelect.style.display = "block";
  stberry.style.display = "block";
  grape.style.display = "block";
  tomato.style.display = "block";
  sec2.style.display = "block";
  window.scrollTo(0, 1000, { behavior: "smooth" });
});
jindo.addEventListener("click", () => {
  for (let i = 0; i < crops.length; i++) {
    crops[i].style.display = "none";
  }
  cropSelect.style.display = "block";
  pepper.style.display = "block";
  greenonion.style.display = "block";
  onion.style.display = "block";
  sec2.style.display = "block";
  window.scrollTo(0, 1000, { behavior: "smooth" });
});
mokpo.addEventListener("click", () => {
  for (let i = 0; i < crops.length; i++) {
    crops[i].style.display = "none";
  }
  cropSelect.style.display = "block";
  chives.style.display = "block";
  cucumber.style.display = "block";
  grape.style.display = "block";
  sec2.style.display = "block";
  window.scrollTo(0, 1000, { behavior: "smooth" });
});
muan.addEventListener("click", () => {
  for (let i = 0; i < crops.length; i++) {
    crops[i].style.display = "none";
  }
  cropSelect.style.display = "block";
  spotato.style.display = "block";
  rice.style.display = "block";
  garlic.style.display = "block";
  sec2.style.display = "block";
  window.scrollTo(0, 1000, { behavior: "smooth" });
});
naju.addEventListener("click", () => {
  for (let i = 0; i < crops.length; i++) {
    crops[i].style.display = "none";
  }
  cropSelect.style.display = "block";
  stberry.style.display = "block";
  tomato.style.display = "block";
  chives.style.display = "block";
  sec2.style.display = "block";
  window.scrollTo(0, 1000, { behavior: "smooth" });
});
sinan.addEventListener("click", () => {
  for (let i = 0; i < crops.length; i++) {
    crops[i].style.display = "none";
  }
  cropSelect.style.display = "block";
  spinach.style.display = "block";
  kiwi.style.display = "block";
  greenonion.style.display = "block";
  sec2.style.display = "block";
  window.scrollTo(0, 1000, { behavior: "smooth" });
});
suncheon.addEventListener("click", () => {
  for (let i = 0; i < crops.length; i++) {
    crops[i].style.display = "none";
  }
  cropSelect.style.display = "block";
  stberry.style.display = "block";
  peach.style.display = "block";
  cucumber.style.display = "block";
  sec2.style.display = "block";
  window.scrollTo(0, 1000, { behavior: "smooth" });
});
wando.addEventListener("click", () => {
  for (let i = 0; i < crops.length; i++) {
    crops[i].style.display = "none";
  }
  cropSelect.style.display = "block";
  rice.style.display = "block";
  spinach.style.display = "block";
  greenonion.style.display = "block";
  sec2.style.display = "block";
  window.scrollTo(0, 1000, { behavior: "smooth" });
});
yeongam.addEventListener("click", () => {
  for (let i = 0; i < crops.length; i++) {
    crops[i].style.display = "none";
  }
  cropSelect.style.display = "block";
  spotato.style.display = "block";
  rice.style.display = "block";
  pepper.style.display = "block";
  sec2.style.display = "block";
  window.scrollTo(0, 1000, { behavior: "smooth" });
});
yeonggwang.addEventListener("click", () => {
  for (let i = 0; i < crops.length; i++) {
    crops[i].style.display = "none";
  }
  cropSelect.style.display = "block";
  stberry.style.display = "block";
  spotato.style.display = "block";
  onion.style.display = "block";
  sec2.style.display = "block";
  window.scrollTo(0, 1000, { behavior: "smooth" });
});
yeosu.addEventListener("click", () => {
  for (let i = 0; i < crops.length; i++) {
    crops[i].style.display = "none";
  }
  cropSelect.style.display = "block";
  garlic.style.display = "block";
  grape.style.display = "block";
  onion.style.display = "block";
  sec2.style.display = "block";
  window.scrollTo(0, 1000, { behavior: "smooth" });
});

//작물이름 클릭시
for (let i = 0; i < crops.length; i++) {
  crops[i].addEventListener("click", () => {
    for (let j = 0; j < crops.length; j++) {
      infoUps[j].style.display = "none";
      infoDowns[j].style.display = "none";
    }
    cropInfo.style.display = "block";
    infoUps[i].style.display = "block";
    infoDowns[i].style.display = "block";
    btnSubmit.style.display = "block";
    sec3.style.display = "block";
    window.scrollTo(0, 1500, { behavior: "smooth" });
  });
}
//작물이름 오버 & 아웃시
whiteBoardChives.addEventListener("mouseover", () => {
  whiteBoardChives.style.display = "none";
});
chives.addEventListener("mouseout", () => {
  whiteBoardChives.style.display = "block";
});
chives.addEventListener("mouseover", () => {
  whiteBoardChives.style.display = "none";
});

whiteBoardCucumber.addEventListener("mouseover", () => {
  whiteBoardCucumber.style.display = "none";
});
cucumber.addEventListener("mouseout", () => {
  whiteBoardCucumber.style.display = "block";
});
cucumber.addEventListener("mouseover", () => {
  whiteBoardCucumber.style.display = "none";
});

whiteBoardGarlic.addEventListener("mouseover", () => {
  whiteBoardGarlic.style.display = "none";
});
garlic.addEventListener("mouseout", () => {
  whiteBoardGarlic.style.display = "block";
});
garlic.addEventListener("mouseover", () => {
  whiteBoardGarlic.style.display = "none";
});

whiteBoardGrape.addEventListener("mouseover", () => {
  whiteBoardGrape.style.display = "none";
});
grape.addEventListener("mouseout", () => {
  whiteBoardGrape.style.display = "block";
});
grape.addEventListener("mouseover", () => {
  whiteBoardGrape.style.display = "none";
});

whiteBoardGreenonion.addEventListener("mouseover", () => {
  whiteBoardGreenonion.style.display = "none";
});
greenonion.addEventListener("mouseout", () => {
  whiteBoardGreenonion.style.display = "block";
});
greenonion.addEventListener("mouseover", () => {
  whiteBoardGreenonion.style.display = "none";
});

whiteBoardKiwi.addEventListener("mouseover", () => {
  whiteBoardKiwi.style.display = "none";
});
kiwi.addEventListener("mouseout", () => {
  whiteBoardKiwi.style.display = "block";
});
kiwi.addEventListener("mouseover", () => {
  whiteBoardKiwi.style.display = "none";
});

whiteBoardPeach.addEventListener("mouseover", () => {
  whiteBoardPeach.style.display = "none";
});
peach.addEventListener("mouseout", () => {
  whiteBoardPeach.style.display = "block";
});
peach.addEventListener("mouseover", () => {
  whiteBoardPeach.style.display = "none";
});

whiteBoardPepper.addEventListener("mouseover", () => {
  whiteBoardPepper.style.display = "none";
});
pepper.addEventListener("mouseout", () => {
  whiteBoardPepper.style.display = "block";
});
pepper.addEventListener("mouseover", () => {
  whiteBoardPepper.style.display = "none";
});

whiteBoardOnion.addEventListener("mouseover", () => {
  whiteBoardOnion.style.display = "none";
});
onion.addEventListener("mouseout", () => {
  whiteBoardOnion.style.display = "block";
});
onion.addEventListener("mouseover", () => {
  whiteBoardOnion.style.display = "none";
});

whiteBoardRice.addEventListener("mouseover", () => {
  whiteBoardRice.style.display = "none";
});
rice.addEventListener("mouseout", () => {
  whiteBoardRice.style.display = "block";
});
rice.addEventListener("mouseover", () => {
  whiteBoardRice.style.display = "none";
});

whiteBoardSpinach.addEventListener("mouseover", () => {
  whiteBoardSpinach.style.display = "none";
});
spinach.addEventListener("mouseout", () => {
  whiteBoardSpinach.style.display = "block";
});
spinach.addEventListener("mouseover", () => {
  whiteBoardSpinach.style.display = "none";
});

whiteBoardSpotato.addEventListener("mouseover", () => {
  whiteBoardSpotato.style.display = "none";
});
spotato.addEventListener("mouseout", () => {
  whiteBoardSpotato.style.display = "block";
});
spotato.addEventListener("mouseover", () => {
  whiteBoardSpotato.style.display = "none";
});

whiteBoardStberry.addEventListener("mouseover", () => {
  whiteBoardStberry.style.display = "none";
});
stberry.addEventListener("mouseout", () => {
  whiteBoardStberry.style.display = "block";
});
stberry.addEventListener("mouseover", () => {
  whiteBoardStberry.style.display = "none";
});

whiteBoardTomato.addEventListener("mouseover", () => {
  whiteBoardTomato.style.display = "none";
});
tomato.addEventListener("mouseout", () => {
  whiteBoardTomato.style.display = "block";
});
tomato.addEventListener("mouseover", () => {
  whiteBoardTomato.style.display = "none";
});

//버튼리셋
btnReset.addEventListener("click", () => {
  document.body.scrollTo = (0, 0, { behavior: "smooth" });
  cropInfo.style.display = "none";
  sec3.style.display = "none";
  cropSelect.style.display = "none";
  sec2.style.display = "none";
  btnSubmit.style.display = "none";
});

//모달 띄우고 닫기
btnSubmit.addEventListener("click", () => {
  for (let i = 0; i < modals.length; i++) {
    if (infoUps[i].style.display === "block") {
      modals[i].style.display = "block";
    }
  }
  modalBox.style.display = "block";
});
btnCloseModal.addEventListener("click", () => {
  for (let i = 0; i < modals.length; i++) {
    if (modals[i].style.display === "block") {
      modals[i].style.display = "none";
    }
  }
  modalBox.style.display = "none";
});

//모달 저장
const btnModalSubmit = document.querySelector("#submit-modal");

//저장출력
btnModalSubmit.addEventListener("click", () => {
  alert("저장 되었습니다.");
});

const wyc_crop_button = document.querySelectorAll(".wyc_crop_button");
for (let crop of wyc_crop_button) {
  crop.addEventListener("click", () => {
    console.log(crop.classList[0].substring(4));
  });
}

// wyc_boseong.addEventListener("click", () => {
//   alert("asdasda");
// });
