/**
 * 
 */
// 고흥 딸기 수익 그래프
// var data = {
//     labels: ['매출', '비용', '수익'],
//     datasets: [{
//     label: '단위(원)',
//     data: [85782598, 39900000, (85782598-39900000)],
//     backgroundColor: ['rgb(54, 162, 235, 0.5)', 'rgb(255, 99, 132, 0.5)', 'rgb(100, 192, 192, 0.5'],
//     borderColor: ['rgba(54, 162, 235, 1)', 'rgba(255, 99, 132, 1)', 'rgba(75, 192, 192, 1)'],
//     borderWidth:2
//     }]
// };

// var ctx = document.getElementById('myChart').getContext('2d');
// var myChart = new Chart(ctx, {
// type: 'bar',
// data: data,
// options: {
//     plugins:{
//         title: {
//             // display:true,
//             // text:'내년 딸기 예상 수익',
//             // fontstyle:'bold',
//             // fontSize: 30,
//         },
//         legend: {
//             display: false,
//         },

//     },
//     maxBarThickness:200
// }
// });


// 곡성 딸기 수익 그래프
var data_gokseong_strawberry = {
    labels: ['매출', '비용', '수익'],
    datasets: [{
    label: '단위(원)',
    data: [26807062, 15254051+(25365757/3), 26807062-(15254051+(25365757/3))],
    backgroundColor: ['rgb(54, 162, 235, 0.5)', 'rgb(255, 99, 132, 0.5)', 'rgb(100, 192, 192, 0.5'],
    borderColor: ['rgba(54, 162, 235, 1)', 'rgba(255, 99, 132, 1)', 'rgba(75, 192, 192, 1)'],
    borderWidth:2
    }]
};

var ctx = document.getElementById('graphgokseong_strawberry').getContext('2d');
var myChart = new Chart(ctx, {
type: 'bar',
data: data_gokseong_strawberry,
options: {
    plugins:{
        title: {
            // display:true,
            // text:'내년 곡성 딸기 예상 수익',
            // fontstyle:'bold',
            // fontSize: 30,
        },
        legend: {
            display: false,
        },

    },
    maxBarThickness:100
}
});

// 나주 딸기 수익 그래프
var data_naju_strawberry = {
    labels: ['매출', '비용', '수익'],
    datasets: [{
    label: '단위(원)',
    data: [26807062, 13872000+(3500000/3), 26807062-(13872000+(3500000/3))],
    backgroundColor: ['rgb(54, 162, 235, 0.5)', 'rgb(255, 99, 132, 0.5)', 'rgb(100, 192, 192, 0.5'],
    borderColor: ['rgba(54, 162, 235, 1)', 'rgba(255, 99, 132, 1)', 'rgba(75, 192, 192, 1)'],
    borderWidth:2
    }]
};

var ctx = document.getElementById('graphnaju_strawberry').getContext('2d');
var myChart = new Chart(ctx, {
type: 'bar',
data: data_naju_strawberry,
options: {
    plugins:{
        title: {
            // display:true,
            // text:'내년 나주 딸기 예상 수익',
            // fontstyle:'bold',
            // fontSize: 30,
        },
        legend: {
            display: false,
        },

    },
    maxBarThickness:100
}
});

// 순천 오이 수익 그래프
var data_suncheon_cucumber = {
    labels: ['매출', '비용', '수익'],
    datasets: [{
    label: '단위(원)',
    data: [53472074, 5277777+(15833333/3), 53472074-(5277777+(15833333/3))],
    backgroundColor: ['rgb(54, 162, 235, 0.5)', 'rgb(255, 99, 132, 0.5)', 'rgb(100, 192, 192, 0.5'],
    borderColor: ['rgba(54, 162, 235, 1)', 'rgba(255, 99, 132, 1)', 'rgba(75, 192, 192, 1)'],
    borderWidth:2
    }]
};

var ctx = document.getElementById('graphsuncheon_cucumber').getContext('2d');
var myChart = new Chart(ctx, {
type: 'bar',
data: data_suncheon_cucumber,
options: {
    plugins:{
        title: {
            // display:true,
            // text:'내년 순천 오이 예상 수익',
            // fontstyle:'bold',
            // fontSize: 30,
        },
        legend: {
            display: false,
        },

    },
    maxBarThickness:100
}
});

// 나주 토마토 수익 그래프
var data_naju_tomato = {
    labels: ['매출', '비용', '정책 지원','수익'],
    datasets: [{
    label: '단위(원)',
    data: [42825118, 10000000+(50000000/3), 12000000, 42825118-(10000000+(50000000/3))+12000000],
    backgroundColor: ['rgb(54, 162, 235, 0.5)', 'rgb(255, 99, 132, 0.5)', 'rgb(120, 1, 102, 0.5',  'rgb(100, 192, 192, 0.5'],
    borderColor: ['rgba(54, 162, 235, 1)', 'rgba(255, 99, 132, 1)', 'rgb(120, 1, 102)', 'rgb(100, 192, 192'],
    borderWidth:2
    }]
};

var ctx = document.getElementById('graphnaju_tomato').getContext('2d');
var myChart = new Chart(ctx, {
type: 'bar',
data: data_naju_tomato,
options: {
    plugins:{
        title: {
            // display:true,
            // text:'내년 나주 토마토 예상 수익',
            // fontstyle:'bold',
            // fontSize: 30,
        },
        legend: {
            display: false,
        },

    },
    maxBarThickness:100
}
});


// charts.forEach(obj =>{
//     obj.destory()
// })
// charts = [];

// let chart = new chart($("#graphgokseong_strawberry"), config)
// chart.push(chart)