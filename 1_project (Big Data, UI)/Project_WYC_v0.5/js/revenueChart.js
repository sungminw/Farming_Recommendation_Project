// 농작물 매출(Chart-line.html 참조)
var chives_data = {
  labels: [
    2003, 2004, 2005, 2006, 2007, 2008, 2009, 2010, 2011, 2012, 2013, 2014,
    2015, 2016, 2017, 2018, 2019, 2020, 2021, 2023,
  ],
  datasets: [
    {
      label: "쪽파 매출 추이(10a, 만원)",
      data: [
        296.79, 296.79, 246.47, 229.39, 181.59, 350.01, 238.27, 282.74, 401.22,
        302.41, 426.28, 351.97, 334.11, 369.13, 545.09, 396.87, 388.53, 365.96,
        631.11, 608.84, 631.89,
      ],
      fill: false,
      borderColor: "rgb(207, 142, 255)",
      tension: 0.1,
    },
  ],
};
var ctx = document.getElementById("chives").getContext("2d");
var myChart = new Chart(ctx, {
  type: "line",
  data: chives_data,
  options: {},
});

var cucumber_data = {
  labels: [
    2003, 2004, 2005, 2006, 2007, 2008, 2009, 2010, 2011, 2012, 2013, 2014,
    2015, 2016, 2017, 2018, 2019, 2020, 2021, 2023,
  ],
  datasets: [
    {
      label: "오이 매출 추이(10a, 만원)",
      data: [
        3099.26, 3632.87, 3613.93, 3909.4, 3813.31, 4344.5, 4844.4, 5707.17,
        2387.61, 5974.23, 4960.572, 5099.48, 5493.16, 5261.82, 4683.07, 4694.35,
        4717.57, 4986.6, 5181.38, 5347.2,
      ],
      fill: false,
      borderColor: "rgb(75, 192, 192)",
      tension: 0.1,
    },
  ],
};
var ctx = document.getElementById("cucumber").getContext("2d");
var myChart = new Chart(ctx, {
  type: "line",
  data: cucumber_data,
  options: {},
});

var garlic_data = {
  labels: [
    2003, 2004, 2005, 2006, 2007, 2008, 2009, 2010, 2011, 2012, 2013, 2014,
    2015, 2016, 2017, 2018, 2019, 2020, 2021, 2023,
  ],
  datasets: [
    {
      label: "마늘 매출 추이(10a, 만원)",
      data: [
        189.39, 223.67, 200.67, 179.44, 234.73, 212.91, 220.1, 426.83, 456.23,
        411.1, 364.59, 309.7, 507.2, 580.08, 484.19, 361.25, 328.79, 374.9,
        611.34, 505.1,
      ],
      fill: false,
      borderColor: "rgb(255, 196, 117)",
      tension: 0.1,
    },
  ],
};
var ctx = document.getElementById("garlic").getContext("2d");
var myChart = new Chart(ctx, {
  type: "line",
  data: garlic_data,
  options: {},
});

var grape_data = {
  labels: [
    2009, 2010, 2011, 2012, 2013, 2014, 2015, 2016, 2017, 2018, 2019, 2020,
    2021, 2023,
  ],
  datasets: [
    {
      label: "포도 매출 추이(10a, 만원)",
      data: [
        189.39, 223.67, 200.67, 179.44, 234.73, 212.91, 220.1, 426.83, 456.23,
        411.1, 364.59, 309.7, 507.2, 580.08, 484.19, 361.25, 328.79, 374.9,
        611.34, 505.1,
      ],
      borderColor: "rgb(11, 31, 192)",
      tension: 0.1,
    },
  ],
};
var ctx = document.getElementById("grape").getContext("2d");
var myChart = new Chart(ctx, {
  type: "line",
  data: grape_data,
  options: {},
});

var greenonion_data = {
  labels: [
    2003, 2004, 2005, 2006, 2007, 2008, 2009, 2010, 2011, 2012, 2013, 2014,
    2015, 2016, 2017, 2018, 2019, 2020, 2021, 2023,
  ],
  datasets: [
    {
      label: "파 매출 추이(10a, 만원)",
      data: [
        345.02, 200.76, 303.79, 247.24, 310.21, 191.98, 248.89, 399.17, 221.92,
        380.71, 303.58, 267.44, 364.2, 408.4, 331.49, 292.9, 283.1, 351.14,
        277.79, 274.24,
      ],
      fill: false,
      borderColor: "rgb(123, 31, 192)",
      tension: 0.1,
    },
  ],
};
var ctx = document.getElementById("greenonion").getContext("2d");
var myChart = new Chart(ctx, {
  type: "line",
  data: greenonion_data,
  options: {},
});

var kiwi_data = {
  labels: [
    2008, 2009, 2010, 2011, 2012, 2013, 2014, 2015, 2016, 2017, 2018, 2019,
    2020, 2021, 2023,
  ],
  datasets: [
    {
      label: "키위 매출 추이(10a, 만원)",
      data: [
        600.39, 659.08, 566.73, 533.64, 509.54, 615.6, 549.09, 552.12, 537.82,
        541.41, 710.94, 717.12, 891.7, 1047.26, 873.48,
      ],
      fill: false,
      borderColor: "rgb(22, 113, 159)",
      tension: 0.1,
    },
  ],
};
var ctx = document.getElementById("kiwi").getContext("2d");
var myChart = new Chart(ctx, {
  type: "line",
  data: kiwi_data,
  options: {},
});

var onion_data = {
  labels: [
    2003, 2004, 2005, 2006, 2007, 2008, 2009, 2010, 2011, 2012, 2013, 2014,
    2015, 2016, 2017, 2018, 2019, 2020, 2021, 2023,
  ],
  datasets: [
    {
      label: "양파 매출 추이(10a, 만원)",
      data: [
        237.64, 177.07, 190.79, 184.87, 172.53, 314.79, 293.56, 324.38, 290.84,
        349.25, 436.47, 225.48, 352.16, 362.11, 452.51, 270.56, 278.18, 428.51,
        467.82, 500.56,
      ],
      fill: false,
      borderColor: "rgb(255, 0, 0)",
      tension: 0.1,
    },
  ],
};
var ctx = document.getElementById("onion").getContext("2d");
var myChart = new Chart(ctx, {
  type: "line",
  data: onion_data,
  options: {},
});

var peach_data = {
  labels: [
    2009, 2010, 2011, 2012, 2013, 2014, 2015, 2016, 2017, 2018, 2019, 2020,
    2021, 2023,
  ],
  datasets: [
    {
      label: "복숭아 매출 추이(10a, 만원)",
      data: [
        358.8, 416.93, 417.41, 521.33, 530.68, 484.97, 507.81, 483.31, 454.36,
        521.04, 436.77, 377.06, 486.13, 484.28,
      ],
      fill: false,
      borderColor: "rgb(0, 255, 0)",
      tension: 0.1,
    },
  ],
};
var ctx = document.getElementById("peach").getContext("2d");
var myChart = new Chart(ctx, {
  type: "line",
  data: peach_data,
  options: {},
});

var chili_data = {
  labels: [
    2003, 2004, 2005, 2006, 2007, 2008, 2009, 2010, 2011, 2012, 2013, 2014,
    2015, 2016, 2017, 2018, 2019, 2020, 2021, 2023,
  ],
  datasets: [
    {
      label: "고추 매출 추이(10a, 만원)",
      data: [
        233.33, 238.49, 220.91, 248.43, 254.42, 263.59, 285.68, 245.23, 421.72,
        432.21, 291.04, 299.93, 333.07, 282.95, 341.99, 534.36, 362.64, 456.88,
        507.9, 422.96,
      ],
      fill: false,
      borderColor: "rgb(0, 0, 255)",
      tension: 0.1,
    },
  ],
};
var ctx = document.getElementById("chili").getContext("2d");
var myChart = new Chart(ctx, {
  type: "line",
  data: chili_data,
  options: {},
});

var rice_data = {
  labels: [
    2003, 2004, 2005, 2006, 2007, 2008, 2009, 2010, 2011, 2012, 2013, 2014,
    2015, 2016, 2017, 2018, 2019, 2020, 2021, 2023,
  ],
  datasets: [
    {
      label: "쌀 매출 추이(10a, 만원)",
      data: [
        90.16, 97.11, 82.31, 81.24, 77.68, 90.41, 86.47, 76.73, 91.04, 81.41,
        100.18, 93.51, 91.24, 77.76, 94.06, 110.91, 102.52, 109.59, 122.28,
        112.75,
      ],
      fill: false,
      borderColor: "rgb(0, 0, 0)",
      tension: 0.1,
    },
  ],
};
var ctx = document.getElementById("rice").getContext("2d");
var myChart = new Chart(ctx, {
  type: "line",
  data: rice_data,
  options: {},
});

var spinach_data = {
  labels: [
    2003, 2004, 2005, 2006, 2007, 2008, 2009, 2010, 2011, 2012, 2013, 2014,
    2015, 2016, 2017, 2018, 2019, 2020, 2021, 2023,
  ],
  datasets: [
    {
      label: "시금치 매출 추이(10a, 만원)",
      data: [
        252.21, 236.43, 252.57, 222.94, 244.54, 482.92, 498.86, 598.97, 613.65,
        613.65, 723.48, 583.24, 596.58, 601.55, 509.47, 546.29, 569.87, 614.55,
        648.74, 659.46,
      ],
      fill: false,
      borderColor: "rgb(111, 50, 50)",
      tension: 0.1,
    },
  ],
};
var ctx = document.getElementById("spinach").getContext("2d");
var myChart = new Chart(ctx, {
  type: "line",
  data: spinach_data,
  options: {},
});

var spotato_data = {
  labels: [
    2003, 2004, 2005, 2006, 2007, 2008, 2009, 2010, 2011, 2012, 2013, 2014,
    2015, 2016, 2017, 2018, 2019, 2020, 2021, 2023,
  ],
  datasets: [
    {
      label: "고구마 매출 추이(10a, 만원)",
      data: [
        134.13, 135.9, 134.39, 154.07, 158.01, 176.68, 188.98, 210.59, 258.49,
        270.03, 269.46, 272.99, 283.22, 313.79, 287.86, 317.76, 282.88, 345.66,
        383.13, 380.98,
      ],
      fill: false,
      borderColor: "skyblue",
      tension: 0.1,
    },
  ],
};
var ctx = document.getElementById("spotato").getContext("2d");
var myChart = new Chart(ctx, {
  type: "line",
  data: spotato_data,
  options: {},
});

var stberry_data = {
  labels: [
    2003, 2004, 2005, 2006, 2007, 2008, 2009, 2010, 2011, 2012, 2013, 2014,
    2015, 2016, 2017, 2018, 2019, 2020, 2021, 2023,
  ],
  datasets: [
    {
      label: "딸기 매출 추이(10a, 만원)",
      data: [
        2068.26, 2069.9, 2154.47, 2363.78, 2609.53, 2653.54, 2842.27, 2860.7,
        3619.87, 3984.2, 4145.42, 4200.15, 4239.85, 4158.51, 4197.9, 2334.31,
        2225.48, 2316.17, 2648.97, 2680.7,
      ],
      fill: false,
      borderColor: "pink",
      tension: 0.1,
    },
  ],
};
var ctx = document.getElementById("stberry").getContext("2d");
var myChart = new Chart(ctx, {
  type: "line",
  data: stberry_data,
  options: {},
});

var tomato_data = {
  labels: [
    2003, 2004, 2005, 2006, 2007, 2008, 2009, 2010, 2011, 2012, 2013, 2014,
    2015, 2016, 2017, 2018, 2019, 2020, 2021, 2023,
  ],
  datasets: [
    {
      label: "토마토 매출 추이(10a, 만원)",
      data: [
        2413.09, 2562.45, 2470.66, 2508.19, 2459.06, 2723.43, 3000.76, 3138.55,
        3173.34, 3905.07, 4402.83, 3993.83, 4141.0, 4100.36, 4111.89, 3559.97,
        4121.22, 4179.48, 4526.39, 4282.51,
      ],
      fill: false,
      borderColor: "rgb(150, 20, 30)",
      tension: 0.1,
    },
  ],
};
var ctx = document.getElementById("tomato").getContext("2d");
var myChart = new Chart(ctx, {
  type: "line",
  data: tomato_data,
  options: {},
});
