// 농작물 매출(Chart-line.html 참조)

var chives_data = {
    labels: [2003, 2004, 2005, 2006, 2007, 2008, 2009, 2010, 2011, 2012, 2013, 2014, 2015, 2016, 2017, 2018, 2019, 2020, 2021, 2023],
    datasets: [{
    label: '쪽파 매출 추이(10a, 만원)',
    data: [296.79, 296.79, 246.47, 229.39, 181.59, 350.01, 238.27, 282.74, 401.22, 302.41, 426.28, 351.97, 334.11, 369.13, 545.09, 396.87, 388.53, 365.96, 631.11, 608.84, 631.89],
    fill: false,
    borderColor: 'rgb(207, 142, 255)',
    tension: 0.1
    }]
};
var ctx = document.getElementById('chives').getContext('2d');
var myChart = new Chart(ctx, {
type: 'line', 
data: chives_data,
options: {}
});

var cucumber_data = {
    labels: [2003, 2004, 2005, 2006, 2007, 2008, 2009, 2010, 2011, 2012, 2013, 2014, 2015, 2016, 2017, 2018, 2019, 2020, 2021, 2023],
    datasets: [{
    label: '오이 매출 추이(10a, 만원)',
    data: [3099.26, 3632.87, 3613.93, 3909.40, 3813.31, 4344.50, 4844.40, 5707.17, 2387.61, 5974.23, 4960.572, 5099.48, 5493.16, 5261.82, 4683.07, 4694.35, 4717.57, 4986.60, 5181.38, 5347.20],
    fill: false,
    borderColor: 'rgb(75, 192, 192)',
    tension: 0.1
    }]
};
var ctx = document.getElementById('cucumber').getContext('2d');
var myChart = new Chart(ctx, {
type: 'line', 
data: cucumber_data,
options: {}
});

var garlic_data = {
    labels: [2003, 2004, 2005, 2006, 2007, 2008, 2009, 2010, 2011, 2012, 2013, 2014, 2015, 2016, 2017, 2018, 2019, 2020, 2021, 2023],
    datasets: [{
    label: '마늘 매출 추이(10a, 만원)',
    data: [189.39, 223.67, 200.67, 179.44, 234.73, 212.91, 220.10, 426.83, 456.23, 411.10, 364.59, 309.70, 507.20, 580.08, 484.19, 361.25, 328.79, 374.90, 611.34, 505.10],
    fill: false,
    borderColor: 'rgb(255, 196, 117)',
    tension: 0.1
    }]
};
var ctx = document.getElementById('garlic').getContext('2d');
var myChart = new Chart(ctx, {
type: 'line', 
data: garlic_data,
options: {}
});

var grape_data = {
    labels: [2009, 2010, 2011, 2012, 2013, 2014, 2015, 2016, 2017, 2018, 2019, 2020, 2021, 2023],
    datasets: [{
    label: '포도 매출 추이(10a, 만원)',
    data: [189.39, 223.67, 200.67, 179.44, 234.73, 212.91, 220.10, 426.83, 456.23, 411.10, 364.59, 309.70, 507.20, 580.08, 484.19, 361.25, 328.79, 374.90, 611.34, 505.10],
    borderColor: 'rgb(11, 31, 192)',
    tension: 0.1
    }]
};
var ctx = document.getElementById('grape').getContext('2d');
var myChart = new Chart(ctx, {
type: 'line', 
data: grape_data,
options: {}
});

var greenonion_data = {
    labels: [2003, 2004, 2005, 2006, 2007, 2008, 2009, 2010, 2011, 2012, 2013, 2014, 2015, 2016, 2017, 2018, 2019, 2020, 2021, 2023],
    datasets: [{
    label: '파 매출 추이(10a, 만원)',
    data: [345.02, 200.76, 303.79, 247.24, 310.21, 191.98, 248.89, 399.17, 221.92, 380.71, 303.58, 267.44, 364.20, 408.40, 331.49, 292.90, 283.10, 351.14, 277.79, 274.24],
    fill: false,
    borderColor: 'rgb(123, 31, 192)',
    tension: 0.1
    }]
};
var ctx = document.getElementById('greenonion').getContext('2d');
var myChart = new Chart(ctx, {
type: 'line', 
data: greenonion_data,
options: {}
});

var kiwi_data = {
    labels: [2008, 2009, 2010, 2011, 2012, 2013, 2014, 2015, 2016, 2017, 2018, 2019, 2020, 2021, 2023],
    datasets: [{
    label: '키위 매출 추이(10a, 만원)',
    data: [600.39, 659.08, 566.73, 533.64, 509.54, 615.60, 549.09, 552.12, 537.82, 541.41, 710.94, 717.12, 891.70, 1047.26, 873.48],
    fill: false,
    borderColor: 'rgb(22, 113, 159)',
    tension: 0.1
    }]
};
var ctx = document.getElementById('kiwi').getContext('2d');
var myChart = new Chart(ctx, {
type: 'line', 
data: kiwi_data,
options: {}
});

var onion_data = {
    labels: [2003, 2004, 2005, 2006, 2007, 2008, 2009, 2010, 2011, 2012, 2013, 2014, 2015, 2016, 2017, 2018, 2019, 2020, 2021, 2023],
    datasets: [{
    label: '양파 매출 추이(10a, 만원)',
    data: [237.64, 177.07, 190.79, 184.87, 172.53, 314.79, 293.56, 324.38, 290.84, 349.25, 436.47, 225.48, 352.16, 362.11, 452.51, 270.56, 278.18, 428.51, 467.82, 500.56],
    fill: false,
    borderColor: 'rgb(255, 0, 0)',
    tension: 0.1
    }]
};
var ctx = document.getElementById('onion').getContext('2d');
var myChart = new Chart(ctx, {
type: 'line', 
data: onion_data,
options: {}
});

var peach_data = {
    labels: [2009, 2010, 2011, 2012, 2013, 2014, 2015, 2016, 2017, 2018, 2019, 2020, 2021, 2023],
    datasets: [{
    label: '복숭아 매출 추이(10a, 만원)',
    data: [358.80, 416.93, 417.41, 521.33, 530.68, 484.97, 507.81, 483.31, 454.36, 521.04, 436.77, 377.06, 486.13, 484.28],
    fill: false,
    borderColor: 'rgb(0, 255, 0)',
    tension: 0.1
    }]
};
var ctx = document.getElementById('peach').getContext('2d');
var myChart = new Chart(ctx, {
type: 'line', 
data: peach_data,
options: {}
});

var pepper_data = {
    labels: [2003, 2004, 2005, 2006, 2007, 2008, 2009, 2010, 2011, 2012, 2013, 2014, 2015, 2016, 2017, 2018, 2019, 2020, 2021, 2023],
    datasets: [{
    label: '고추 매출 추이(10a, 만원)',
    data: [233.33, 238.49, 220.91, 248.43, 254.42, 263.59, 285.68, 245.23, 421.72, 432.21, 291.04, 299.93, 333.07, 282.95, 341.99, 534.36, 362.64, 456.88, 507.90, 422.96],
    fill: false,
    borderColor: 'rgb(0, 0, 255)',
    tension: 0.1
    }]
};
var ctx = document.getElementById('pepper').getContext('2d');
var myChart = new Chart(ctx, {
type: 'line', 
data: pepper_data,
options: {}
});

var rice_data = {
    labels: [2003, 2004, 2005, 2006, 2007, 2008, 2009, 2010, 2011, 2012, 2013, 2014, 2015, 2016, 2017, 2018, 2019, 2020, 2021, 2023],
    datasets: [{
    label: '쌀 매출 추이(10a, 만원)',
    data: [90.16, 97.11, 82.31, 81.24, 77.68, 90.41, 86.47, 76.73, 91.04, 81.41, 100.18, 93.51, 91.24, 77.76, 94.06, 110.91, 102.52, 109.59, 122.28, 112.75],
    fill: false,
    borderColor: 'rgb(0, 0, 0)',
    tension: 0.1
    }]
};
var ctx = document.getElementById('rice').getContext('2d');
var myChart = new Chart(ctx, {
type: 'line', 
data: rice_data,
options: {}
});

var spinach_data = {
    labels: [2003, 2004, 2005, 2006, 2007, 2008, 2009, 2010, 2011, 2012, 2013, 2014, 2015, 2016, 2017, 2018, 2019, 2020, 2021, 2023],
    datasets: [{
    label: '시금치 매출 추이(10a, 만원)',
    data: [252.21, 236.43, 252.57, 222.94, 244.54, 482.92, 498.86, 598.97, 613.65, 613.65, 723.48, 583.24, 596.58, 601.55, 509.47, 546.29, 569.87, 614.55, 648.74, 659.46],
    fill: false,
    borderColor: 'rgb(111, 50, 50)',
    tension: 0.1
    }]
};
var ctx = document.getElementById('spinach').getContext('2d');
var myChart = new Chart(ctx, {
type: 'line', 
data: spinach_data,
options: {}
});

var spotato_data = {
    labels: [2003, 2004, 2005, 2006, 2007, 2008, 2009, 2010, 2011, 2012, 2013, 2014, 2015, 2016, 2017, 2018, 2019, 2020, 2021, 2023],
    datasets: [{
    label: '고구마 매출 추이(10a, 만원)',
    data: [134.13, 135.90, 134.39, 154.07, 158.01, 176.68, 188.98, 210.59, 258.49, 270.03, 269.46, 272.99, 283.22, 313.79, 287.86, 317.76, 282.88, 345.66, 383.13, 380.98],
    fill: false,
    borderColor: 'skyblue',
    tension: 0.1
    }]
};
var ctx = document.getElementById('spotato').getContext('2d');
var myChart = new Chart(ctx, {
type: 'line', 
data: spotato_data,
options: {}
});

var stberry_data = {
    labels: [2003, 2004, 2005, 2006, 2007, 2008, 2009, 2010, 2011, 2012, 2013, 2014, 2015, 2016, 2017, 2018, 2019, 2020, 2021, 2023],
    datasets: [{
    label: '딸기 매출 추이(10a, 만원)',
    data: [2068.26, 2069.90, 2154.47, 2363.78, 2609.53, 2653.54, 2842.27, 2860.70, 3619.87, 3984.20, 4145.42, 4200.15, 4239.85, 4158.51, 4197.90, 2334.31, 2225.48, 2316.17, 2648.97, 2680.70],
    fill: false,
    borderColor: 'pink',
    tension: 0.1
    }]
};
var ctx = document.getElementById('stberry').getContext('2d');
var myChart = new Chart(ctx, {
type: 'line', 
data: stberry_data,
options: {}
});

var tomato_data = {
    labels: [2003, 2004, 2005, 2006, 2007, 2008, 2009, 2010, 2011, 2012, 2013, 2014, 2015, 2016, 2017, 2018, 2019, 2020, 2021, 2023],
    datasets: [{
    label: '토마토 매출 추이(10a, 만원)',
    data: [2413.09, 2562.45, 2470.66, 2508.19, 2459.06, 2723.43, 3000.76, 3138.55, 3173.34, 3905.07, 4402.83, 3993.83, 4141.00, 4100.36, 4111.89, 3559.97, 4121.22, 4179.48, 4526.39, 4282.51],
    fill: false,
    borderColor: 'rgb(150, 20, 30)',
    tension: 0.1
    }]
};
var ctx = document.getElementById('tomato').getContext('2d');
var myChart = new Chart(ctx, {
type: 'line', 
data: tomato_data,
options: {}
});

// 농작물 생산량(키위 데이터x)
var chives_yield = {
    labels: [2017, 2018, 2019, 2020, 2021],
    datasets: [{
    label: '쪽파 생산량',
    data: [18837, 46982, 27111, 29745, 34829],
    fill: false,
    borderColor: 'red',
    tension: 0.1
    }]
};
var ctx = document.getElementById('chives_yield').getContext('2d');
var myChart = new Chart(ctx, {
type: 'line', 
data: chives_yield,
options: {}
});

var cucumber_yield = {
    labels: [2017, 2018, 2019, 2020, 2021],
    datasets: [{
    label: '오이 생산량',
    data: [18871, 27748, 23340, 28068, 8243],
    fill: false,
    borderColor: 'red',
    tension: 0.1
    }]
};
var ctx = document.getElementById('cucumber_yield').getContext('2d');
var myChart = new Chart(ctx, {
type: 'line', 
data: cucumber_yield,
options: {}
});

var garlic_yield = {
    labels: [2017, 2018, 2019, 2020, 2021],
    datasets: [{
    label: '마늘 생산량',
    data: [70104, 60089, 73674, 70437, 47749],
    fill: false,
    borderColor: 'red',
    tension: 0.1
    }]
};
var ctx = document.getElementById('garlic_yield').getContext('2d');
var myChart = new Chart(ctx, {
type: 'line', 
data: garlic_yield,
options: {}
});

var grape_yield = {
    labels: [2017, 2018, 2019, 2020, 2021],
    datasets: [{
    label: '포도 생산량',
    data: [3952, 3549, 3275, 2482, 2215],
    fill: false,
    borderColor: 'red',
    tension: 0.1
    }]
};
var ctx = document.getElementById('grape_yield').getContext('2d');
var myChart = new Chart(ctx, {
type: 'line', 
data: grape_yield,
options: {}
});

var greenonion_yield = {
    labels: [2017, 2018, 2019, 2020, 2021],
    datasets: [{
    label: '파 생산량',
    data: [145923, 116329, 136264, 118687, 159436],
    fill: false,
    borderColor: 'red',
    tension: 0.1
    }]
};
var ctx = document.getElementById('greenonion_yield').getContext('2d');
var myChart = new Chart(ctx, {
type: 'line', 
data: greenonion_yield,
options: {}
});

var kiwi_yield = {
    labels: [2017, 2018, 2019, 2020, 2021],
    datasets: [{
    label: '키위 생산량',
    data: [0, 0, 0, 0, 0],
    fill: false,
    borderColor: 'red',
    tension: 0.1
    }]
};
var ctx = document.getElementById('kiwi_yield').getContext('2d');
var myChart = new Chart(ctx, {
type: 'line', 
data: kiwi_yield,
options: {}
});

var onion_yield = {
    labels: [2017, 2018, 2019, 2020, 2021],
    datasets: [{
    label: '양파 생산량',
    data: [514896, 558659, 581958, 452737, 579053],
    fill: false,
    borderColor: 'red',
    tension: 0.1
    }]
};
var ctx = document.getElementById('onion_yield').getContext('2d');
var myChart = new Chart(ctx, {
type: 'line', 
data: onion_yield,
options: {}
});

var peach_yield = {
    labels: [2017, 2018, 2019, 2020, 2021],
    datasets: [{
    label: '복숭아 생산량',
    data: [4861, 4364, 6187, 5702, 5779],
    fill: false,
    borderColor: 'red',
    tension: 0.1
    }]
};
var ctx = document.getElementById('peach_yield').getContext('2d');
var myChart = new Chart(ctx, {
type: 'line', 
data: peach_yield,
options: {}
});

var pepper_yield = {
    labels: [2017, 2018, 2019, 2020, 2021],
    datasets: [{
    label: '고추 생산량',
    data: [10077, 10651, 11413, 9941, 13248],
    fill: false,
    borderColor: 'red',
    tension: 0.1
    }]
};
var ctx = document.getElementById('pepper_yield').getContext('2d');
var myChart = new Chart(ctx, {
type: 'line', 
data: pepper_yield,
options: {}
});

var rice_yield = {
    labels: [2017, 2018, 2019, 2020, 2021],
    datasets: [{
    label: '쌀 생산량',
    data: [804903, 745408, 705581, 669302, 768400],
    fill: false,
    borderColor: 'red',
    tension: 0.1
    }]
};
var ctx = document.getElementById('rice_yield').getContext('2d');
var myChart = new Chart(ctx, {
type: 'line', 
data: rice_yield,
options: {}
});

var spinach_yield = {
    labels: [2017, 2018, 2019, 2020, 2021],
    datasets: [{
    label: '시금치 생산량',
    data: [8354, 7455, 8038, 6512, 4201],
    fill: false,
    borderColor: 'red',
    tension: 0.1
    }]
};
var ctx = document.getElementById('spinach_yield').getContext('2d');
var myChart = new Chart(ctx, {
type: 'line', 
data: spinach_yield,
options: {}
});

var spotato_yield = {
    labels: [2017, 2018, 2019, 2020, 2021],
    datasets: [{
    label: '고구마 생산량',
    data: [86685, 94862, 138011, 97635, 108081],
    fill: false,
    borderColor: 'red',
    tension: 0.1
    }]
};
var ctx = document.getElementById('spotato_yield').getContext('2d');
var myChart = new Chart(ctx, {
type: 'line', 
data: spotato_yield,
options: {}
});

var stberry_yield = {
    labels: [2017, 2018, 2019, 2020, 2021],
    datasets: [{
    label: '딸기 생산량',
    data: [24329, 26361, 22195, 19047, 17775],
    fill: false,
    borderColor: 'red',
    tension: 0.1
    }]
};
var ctx = document.getElementById('stberry_yield').getContext('2d');
var myChart = new Chart(ctx, {
type: 'line', 
data: stberry_yield,
options: {}
});

var tomato_yield = {
    labels: [2017, 2018, 2019, 2020, 2021],
    datasets: [{
    label: '토마토 생산량',
    data: [61396, 52035, 59349, 55099, 41196],
    fill: false,
    borderColor: 'red',
    tension: 0.1
    }]
};
var ctx = document.getElementById('tomato_yield').getContext('2d');
var myChart = new Chart(ctx, {
type: 'line', 
data: tomato_yield,
options: {}
});

// 농작물 경매단가(포도 데이터x)
var chives_price = {
    labels: [2017, 2018, 2019, 2020, 2021],
    datasets: [{
    label: '쪽파 경매단가',
    data: [2205, 2277, 2282, 2412, 2804],
    fill: false,
    borderColor: 'blue',
    tension: 0.1
    }]
};
var ctx = document.getElementById('chives_price').getContext('2d');
var myChart = new Chart(ctx, {
type: 'line', 
data: chives_price,
options: {}
});

var cucumber_price = {
    labels: [2017, 2018, 2019, 2020, 2021],
    datasets: [{
    label: '오이 경매단가',
    data: [20758, 18672, 18972, 20244, 19017],
    fill: false,
    borderColor: 'blue',
    tension: 0.1
    }]
};
var ctx = document.getElementById('cucumber_price').getContext('2d');
var myChart = new Chart(ctx, {
type: 'line', 
data: cucumber_price,
options: {}
});

var garlic_price = {
    labels: [2017, 2018, 2019, 2020, 2021],
    datasets: [{
    label: '마늘 경매단가',
    data: [40100, 44200, 50333, 55533, 52403],
    fill: false,
    borderColor: 'blue',
    tension: 0.1
    }]
};
var ctx = document.getElementById('garlic_price').getContext('2d');
var myChart = new Chart(ctx, {
type: 'line', 
data: garlic_price,
options: {}
});

var grape_price = {
    labels: [2017, 2018, 2019, 2020, 2021],
    datasets: [{
    label: '포도 경매단가',
    data: [0, 0, 0, 0, 0],
    fill: false,
    borderColor: 'blue',
    tension: 0.1
    }]
};
var ctx = document.getElementById('grape_price').getContext('2d');
var myChart = new Chart(ctx, {
type: 'line', 
data: grape_price,
options: {}
});

var greenonion_price = {
    labels: [2017, 2018, 2019, 2020, 2021],
    datasets: [{
    label: '파 경매단가',
    data: [1709, 1811, 1497, 1496, 1521],
    fill: false,
    borderColor: 'blue',
    tension: 0.1
    }]
};
var ctx = document.getElementById('greenonion_price').getContext('2d');
var myChart = new Chart(ctx, {
type: 'line', 
data: greenonion_price,
options: {}
});

var kiwi_price = {
    labels: [2017, 2018, 2019, 2020, 2021],
    datasets: [{
    label: '키위 경매단가',
    data: [36000, 34733, 36000, 34320, 35225],
    fill: false,
    borderColor: 'blue',
    tension: 0.1
    }]
};
var ctx = document.getElementById('kiwi_price').getContext('2d');
var myChart = new Chart(ctx, {
type: 'line', 
data: kiwi_price,
options: {}
});

var onion_price = {
    labels: [2017, 2018, 2019, 2020, 2021],
    datasets: [{
    label: '양파 경매단가',
    data: [12700, 13888, 12788, 13678, 14237],
    fill: false,
    borderColor: 'blue',
    tension: 0.1
    }]
};
var ctx = document.getElementById('onion_price').getContext('2d');
var myChart = new Chart(ctx, {
type: 'line', 
data: onion_price,
options: {}
});

var peach_price = {
    labels: [2017, 2018, 2019, 2020, 2021],
    datasets: [{
    label: '복숭아 경매단가',
    data: [15572, 16029, 15384, 17183, 17673],
    fill: false,
    borderColor: 'blue',
    tension: 0.1
    }]
};
var ctx = document.getElementById('peach_price').getContext('2d');
var myChart = new Chart(ctx, {
type: 'line', 
data: peach_price,
options: {}
});

var pepper_price = {
    labels: [2017, 2018, 2019, 2020, 2021],
    datasets: [{
    label: '고추 경매단가',
    data: [395000, 362933, 363333, 441667, 433611],
    fill: false,
    borderColor: 'blue',
    tension: 0.1
    }]
};
var ctx = document.getElementById('pepper_price').getContext('2d');
var myChart = new Chart(ctx, {
type: 'line', 
data: pepper_price,
options: {}
});

var rice_price = {
    labels: [2017, 2018, 2019, 2020, 2021],
    datasets: [{
    label: '쌀 경매단가',
    data: [41933, 39987, 39987, 40523, 42507],
    fill: false,
    borderColor: 'blue',
    tension: 0.1
    }]
};
var ctx = document.getElementById('rice_price').getContext('2d');
var myChart = new Chart(ctx, {
type: 'line', 
data: rice_price,
options: {}
});

var spinach_price = {
    labels: [2017, 2018, 2019, 2020, 2021],
    datasets: [{
    label: '시금치 경매단가',
    data: [10360, 10587, 10560, 10597, 10047],
    fill: false,
    borderColor: 'blue',
    tension: 0.1
    }]
};
var ctx = document.getElementById('spinach_price').getContext('2d');
var myChart = new Chart(ctx, {
type: 'line', 
data: spinach_price,
options: {}
});

var spotato_price = {
    labels: [2017, 2018, 2019, 2020, 2021],
    datasets: [{
    label: '고구마 경매단가',
    data: [27213, 25853, 28940, 31973, 38264],
    fill: false,
    borderColor: 'blue',
    tension: 0.1
    }]
};
var ctx = document.getElementById('spotato_price').getContext('2d');
var myChart = new Chart(ctx, {
type: 'line', 
data: spotato_price,
options: {}
});

var stberry_price = {
    labels: [2017, 2018, 2019, 2020, 2021],
    datasets: [{
    label: '딸기 경매단가',
    data: [14500, 14300, 14607, 14400, 15626],
    fill: false,
    borderColor: 'blue',
    tension: 0.1
    }]
};
var ctx = document.getElementById('stberry_price').getContext('2d');
var myChart = new Chart(ctx, {
type: 'line', 
data: stberry_price,
options: {}
});

var tomato_price = {
    labels: [2017, 2018, 2019, 2020, 2021],
    datasets: [{
    label: '토마토 경매단가',
    data: [15603, 13302, 13135, 12472, 12594],
    fill: false,
    borderColor: 'blue',
    tension: 0.1
    }]
};
var ctx = document.getElementById('tomato_price').getContext('2d');
var myChart = new Chart(ctx, {
type: 'line', 
data: tomato_price,
options: {}
});
