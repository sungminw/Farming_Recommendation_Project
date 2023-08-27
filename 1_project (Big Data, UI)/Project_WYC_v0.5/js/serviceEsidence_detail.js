const carousel_box = document.querySelector("#carousel_box")

const pics = ["house1.jpg", "house2.jpg", "house3.jpg"]

carousel_box.style.backgroundImage = `url(img/${pics[0]})`;

const arrows = document.querySelectorAll(".arrow");
let i =0;
 
arrows.forEach( arrows => {
    arrows.addEventListener("click", (e) => {
        if(e.target.id === "carousel_left"){
            i--;
            if(i<0){
                i = pics.length-1;
            }
        }
        else if (e.target.id === "carousel_right") {
            i++;
            if(i >= pics.length){
                i=0;
            }
        }
        carousel_box.style.backgroundImage = `url(img/${pics[i]})`
    });
});

// const logo_img = document.querySelector("logo_img")

// logo_img.addEventListener("click", ()=>{
//   confirm("농지 및 거주지 화면이로 이동 하시겠습니까 ?", "예")
// })