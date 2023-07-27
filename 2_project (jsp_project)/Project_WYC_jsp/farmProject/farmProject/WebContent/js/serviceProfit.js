/**
 * 
 */




function exFun(graph_name){
  const select_option_sales = document.querySelector(".select_option_sales")
  const select_option_cost = document.querySelector(".select_option_cost")
  const visualization_text = document.querySelector(".visualization_text")

  let str = "";

  let sales = select_option_sales[select_option_sales.selectedIndex].innerHTML
  let cost = select_option_cost[select_option_cost.selectedIndex].innerHTML
  // let result = Math.round(26807062-(15254051+(25365757/3)));

  let result
  if(graph_name==="gokseong_strawberry"){
    result = Math.round(data_gokseong_strawberry.datasets[0].data[2]);
  } else if(graph_name==="naju_strawberry"){
    result = Math.round(data_naju_strawberry.datasets[0].data[2]);
  } else if(graph_name==="suncheon_cucumber"){
    result = Math.round(data_suncheon_cucumber.datasets[0].data[2]);
  } else if(graph_name==="naju_tomato"){
    result = Math.round(data_suncheon_cucumber.datasets[0].data[2]);
  }
  let total = result.toString().replace(/\B(?=(\d{3})+(?!\d))/g, ',');
  str += "<div class='result_message'><span>" +sales+ "</span>과 <span>" +cost+ "</span>을 합산한 예상 연 수익은 <span>" +total+ "원</span> 입니다</div>"

  visualization_text.innerHTML = str;
  

  const select_crop_title = document.querySelector(".select_crop_title")

  select_crop_title.innerHTML = sales.slice(0, -3);

  // 조건에 맞는 그래프 찾기
  const graph_image = document.querySelectorAll(".graph_image")
  const chart_title = document.querySelector(".chart_title")
  const visualization_graph = document.querySelector(".visualization_graph")

  for(let i=0; i<graph_image.length; i++){
    if(graph_image[i].id.substring(5)===graph_name){
      graph_image[i].style.display = "block"
      chart_title.style.display = "block"
      visualization_graph.style.display = "block"
    }
  }

}


function history_same(){
  const visualization_text = document.querySelector(".visualization_text")

  visualization_text.innerHTML = "<div class='default_message'>" +"동일한 지역 및 작물을 선택해 주세요."+ "</div>";

  const select_option_sales = document.querySelector(".select_option_sales")
  const select_option_cost = document.querySelector(".select_option_cost")
  const sales_history = select_option_sales[select_option_sales.selectedIndex].value
  const cost_history = select_option_cost[select_option_cost.selectedIndex].value

  const graph_image = document.querySelectorAll(".graph_image")
  const chart_title = document.querySelector(".chart_title")
  const visualization_graph = document.querySelector(".visualization_graph")
    
  if(sales_history.substr(5) === cost_history.substr(5)){
    for(let i=0; i<graph_image.length; i++){
      graph_image[i].style.display = "none"
    }
    visualization_graph.style.display = "none"



    exFun(sales_history.substr(5))
  }else{
    alert("같은 지역과 농작물을 선택 하시오")
    select_option_sales.selectedIndex = 0;
    select_option_cost.selectedIndex = 0;

    for(let i=0; i<graph_image.length; i++){
      graph_image[i].style.display = "none"
    }
    chart_title.style.display = "none"
    visualization_graph.style.display = "none"
  }
}  


const reset_button = document.querySelector("#reset_button")

reset_button.addEventListener("click", ()=>{
  const visualization_text = document.querySelector(".visualization_text")

  visualization_text.innerHTML = "<div class='default_message'>" +"동일한 지역 및 작물을 선택해 주세요."+ "</div>";

  const graph_image = document.querySelector(".graph_image")
  const chart_title = document.querySelector(".chart_title")
  const visualization_graph = document.querySelector(".visualization_graph")
  
  graph_image.style.display = "none"
  chart_title.style.display = "none"
  visualization_graph.style.display = "none"
})



window.onload = function graph_none(){
  const graph_image = document.querySelectorAll(".graph_image")
  const chart_title = document.querySelector(".chart_title")
  const visualization_graph = document.querySelector(".visualization_graph")
  
  for(let i=0; i<graph_image.length; i++){
    graph_image[i].style.display = "none"
  }
  chart_title.style.display = "none"
  visualization_graph.style.display = "none"

}

