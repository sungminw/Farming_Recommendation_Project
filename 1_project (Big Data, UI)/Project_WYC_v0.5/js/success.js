window.onload = function(){
  var posts =[
      {id:1, title:"씨 뿌린 만큼 거둘 수 있다는게 농사의 즐거움이에요", writer:"김봉석 귀농인", date:"2023-06-01"},
      {id:2, title:"농부가 최고의 직업인 것 같아요", writer:"김덕년 귀농인", date:"2023-06-02"},
      {id:3, title:"틀에 박힌 답답한 도시생활에서 행복을 찾아 나선 용감한 탐험가", writer:"정성민 귀농인", date:"2023-06-03"},
      {id:4, title:"딸기도 잡고 사랑도 잡은 스윗한 사랑꾼", writer:"최철민 귀농인", date:"2023-06-04"},
      {id:5, title:"벌꿀과 블루베리처럼 달콤한 농촌생활을 즐기고있는 부부", writer:"김성종, 정영복 귀농인", date:"2023-06-05"},
      {id:6, title:"가족밖에 몰라 가족친화적인 귀농을 결심한 스윗파더", writer:"오동혁 귀농인", date:"2023-06-06"},
      {id:7, title:"음악을전공한섬세한감성으로벌을세심하게보살피는의성다인면여왕벌", writer:"이은경 귀농인", date:"2023-06-07"},
      {id:8, title:"농업의 미래 먹거리 확신 후 7년 전 귀농 결심", writer:"유주호 귀농인", date:"2023-06-08"},
      {id:9, title:"귀농 후 복숭아 농사를 짓고 있는 행복한 농부 윤희철", writer:"윤희철 귀농인", date:"2023-06-09"},
      {id:10, title:"밭과 뜰이 함께한다는 뜻의 밭뜨레 농원의 서효진 농부", writer:"서효진 귀농인", date:"2023-06-10"},
  ];

  var tableBody = document.querySelector("#board-table tbody");

  for(var i=0; i<posts.length;i++){
      var row = document.createElement("tr");

      var idCell = document.createElement("th");
      idCell.textContent = posts[i].id;
      idCell.scope = "row";

      var titleCell = document.createElement("td");
      titleCell.innerHTML = '<a href="#">' + posts[i].title + "</a>";

      var writerCell = document.createElement("td");
      writerCell.textContent = posts[i].writer;

      var dateCell = document.createElement("td");
      dateCell.textContent = posts[i].date;

      row.appendChild(idCell);
      row.appendChild(titleCell);
      row.appendChild(writerCell);
      row.appendChild(dateCell);

      tableBody.appendChild(row);
  }
};