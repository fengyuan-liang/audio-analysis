# audio-analysis

## 0. 使用

根据自己的操作系统下载对应的release，或者如果您的电脑上配置了`java`环境的话，可以直接执行[audio-analysis.jar](https://github.com/fengyuan-liang/audio-analysis/releases/download/v0.0.2/audio-analysis.jar)

```java
$ java -jar audio-analysis.jar
请输入音乐文件路径，暂只支持mp3格式
F:\workspace\idea\qiniu\audio-analysis\samples\hitme.mp3
Beat timestamps:
[{"time":278,"direction":"down","coordinate":[97,-46],"color":"red"},{"time":603,"direction":"down","coordinate":[34,64],"color":"red"},{"time":928,"direction":"down","coordinate":[-3,-98],"color":"red"},{"time":1160,"direction":"down","coordinate":[5,74],"color":"blue"},{"time":1578,"direction":"up","coordinate":[69,4],"color":"red"},{"time":1880,"direction":"left","coordinate":[-44,-95],"color":"blue"},{"time":2182,"direction":"down","coordinate":[35,65],"color":"red"},{"time":2530,"direction":"down","coordinate":[-92,-76],"color":"blue"},{"time":2856,"direction":"left","coordinate":[-5,-21],"color":"red"},{"time":3181,"direction":"left","coordinate":[-27,-26],"color":"red"},{"time":3506,"direction":"down","coordinate":[17,-42],"color":"blue"},{"time":3831,"direction":"up","coordinate":[-8,88],"color":"red"},{"time":4156,"direction":"right","coordinate":[-98,92],"color":"red"},{"time":4458,"direction":"down","coordinate":[-12,-26],"color":"red"},{"time":4806,"direction":"up","coordinate":[0,85],"color":"blue"},{"time":5108,"direction":"left","coordinate":[98,25],"color":"blue"},{"time":5433,"direction":"right","coordinate":[28,-92],"color":"blue"},{"time":5642,"direction":"down","coordinate":[34,-83],"color":"red"},{"time":6083,"direction":"up","coordinate":[-20,91],"color":"blue"},{"time":6408,"direction":"right","coordinate":[-84,18],"color":"red"},{"time":6733,"direction":"up","coordinate":[-89,32],"color":"blue"},{"time":7058,"direction":"left","coordinate":[-66,48],"color":"red"},{"time":7383,"direction":"down","coordinate":[-48,-78],"color":"blue"},{"time":7709,"direction":"right","coordinate":[-13,-75],"color":"red"},{"time":8034,"direction":"left","coordinate":[-40,-49],"color":"red"},{"time":8335,"direction":"down","coordinate":[18,-67],"color":"red"},{"time":8661,"direction":"right","coordinate":[52,27],"color":"red"},{"time":8986,"direction":"left","coordinate":[53,-32],"color":"red"},{"time":9311,"direction":"down","coordinate":[88,77],"color":"red"},{"time":9636,"direction":"down","coordinate":[70,21],"color":"red"},{"time":9961,"direction":"right","coordinate":[78,84],"color":"red"},{"time":10286,"direction":"up","coordinate":[8,-29],"color":"blue"},{"time":10541,"direction":"up","coordinate":[89,-47],"color":"blue"},{"time":10750,"direction":"down","coordinate":[35,-39],"color":"red"},{"time":11261,"direction":"left","coordinate":[89,-55],"color":"red"},{"time":11563,"direction":"left","coordinate":[29,41],"color":"blue"},{"time":11888,"direction":"right","coordinate":[97,-80],"color":"blue"},{"time":12213,"direction":"right","coordinate":[-10,29],"color":"blue"},{"time":12538,"direction":"down","coordinate":[83,0],"color":"blue"},{"time":12863,"direction":"up","coordinate":[25,45],"color":"blue"},{"time":13188,"direction":"right","coordinate":[-55,51],"color":"red"},{"time":13514,"direction":"left","coordinate":[-77,13],"color":"blue"},{"time":13839,"direction":"left","coordinate":[93,-11],"color":"blue"},{"time":14164,"direction":"left","coordinate":[-59,94],"color":"blue"},{"time":14466,"direction":"down","coordinate":[64,-38],"color":"blue"},{"time":14791,"direction":"down","coordinate":[-81,-64],"color":"red"},{"time":15116,"direction":"left","coordinate":[-26,87],"color":"blue"},{"time":15441,"direction":"down","coordinate":[-14,9],"color":"blue"},{"time":15766,"direction":"up","coordinate":[2,97],"color":"red"},{"time":16091,"direction":"down","coordinate":[46,-62],"color":"blue"},{"time":16416,"direction":"down","coordinate":[-4,-44],"color":"red"},{"time":16741,"direction":"right","coordinate":[66,26],"color":"red"},{"time":17066,"direction":"down","coordinate":[86,56],"color":"red"},{"time":17275,"direction":"down","coordinate":[-72,26],"color":"red"},{"time":17693,"direction":"down","coordinate":[-61,84],"color":"red"},{"time":18018,"direction":"right","coordinate":[-59,3],"color":"red"},{"time":18343,"direction":"up","coordinate":[23,93],"color":"red"},{"time":18552,"direction":"up","coordinate":[-61,89],"color":"red"},{"time":18994,"direction":"left","coordinate":[-27,-39],"color":"blue"},{"time":19319,"direction":"up","coordinate":[11,-9],"color":"red"},{"time":19644,"direction":"up","coordinate":[-7,32],"color":"red"},{"time":19946,"direction":"up","coordinate":[-53,-48],"color":"red"},{"time":20294,"direction":"up","coordinate":[-41,-22],"color":"red"},{"time":20596,"direction":"down","coordinate":[-95,-42],"color":"blue"},{"time":20944,"direction":"down","coordinate":[64,-100],"color":"blue"},{"time":21176,"direction":"left","coordinate":[37,17],"color":"red"},{"time":21571,"direction":"up","coordinate":[78,-79],"color":"red"},{"time":21896,"direction":"down","coordinate":[-76,80],"color":"red"},{"time":22221,"direction":"right","coordinate":[31,54],"color":"red"},{"time":22523,"direction":"left","coordinate":[-24,-8],"color":"red"},{"time":22871,"direction":"right","coordinate":[-28,-29],"color":"red"},{"time":23103,"direction":"left","coordinate":[-14,23],"color":"red"},{"time":23521,"direction":"left","coordinate":[69,-93],"color":"blue"},{"time":23823,"direction":"up","coordinate":[46,34],"color":"blue"},{"time":24148,"direction":"up","coordinate":[-35,-90],"color":"blue"},{"time":24473,"direction":"up","coordinate":[-72,-75],"color":"blue"},{"time":24799,"direction":"left","coordinate":[-6,93],"color":"red"},{"time":25124,"direction":"up","coordinate":[59,-43],"color":"red"},{"time":25449,"direction":"down","coordinate":[63,18],"color":"red"},{"time":25774,"direction":"up","coordinate":[-37,-49],"color":"red"},{"time":26052,"direction":"right","coordinate":[-80,13],"color":"red"},{"time":26401,"direction":"left","coordinate":[-6,-57],"color":"red"},{"time":26749,"direction":"right","coordinate":[44,37],"color":"blue"},{"time":27051,"direction":"up","coordinate":[-35,-48],"color":"red"},{"time":27376,"direction":"down","coordinate":[25,-7],"color":"blue"},{"time":27701,"direction":"down","coordinate":[44,61],"color":"red"},{"time":28026,"direction":"right","coordinate":[68,60],"color":"red"},{"time":28351,"direction":"up","coordinate":[-14,-95],"color":"red"},{"time":28676,"direction":"up","coordinate":[-24,-70],"color":"blue"},{"time":29001,"direction":"right","coordinate":[37,84],"color":"red"},{"time":29326,"direction":"right","coordinate":[98,44],"color":"blue"},{"time":29652,"direction":"up","coordinate":[-19,73],"color":"red"},{"time":29977,"direction":"down","coordinate":[-28,-43],"color":"red"},{"time":30278,"direction":"right","coordinate":[57,-4],"color":"red"},{"time":30604,"direction":"left","coordinate":[-53,-15],"color":"blue"},{"time":30929,"direction":"left","coordinate":[-40,-29],"color":"blue"},{"time":31254,"direction":"down","coordinate":[67,56],"color":"blue"},{"time":31556,"direction":"right","coordinate":[33,-97],"color":"blue"},{"time":31904,"direction":"up","coordinate":[-54,33],"color":"red"},{"time":32229,"direction":"up","coordinate":[6,33],"color":"red"},{"time":32554,"direction":"down","coordinate":[-93,62],"color":"red"}]
耗时：1s
```

如果您使用的是mac，下载[mac_intel-audio-analysis](https://github.com/fengyuan-liang/audio-analysis/releases/download/v0.0.2/mac_intel-audio-analysis)

>第一步：先添加文件可执行权限

```shell
$ ls
mac_intel-audio-analysis
$ chmod +x mac_intel-audio-analysis
```

>第二步，在图形化界面打开（命令行会提示未验证开发者，需要在图形化界面打开一次，之后即可在命令行使用）

![image-20230615095905990](https://cdn.fengxianhub.top/resources-master/image-20230615095905990.png)

后续在命令行即可正常使用

## 1. 节拍检测（Peak Detection）

通过傅里叶变换和差分处理后的数据，基本可以看出音频节奏了，要进一步数据量化，可以采用移动均线等方法。
这部分属于时间序列数据分析的内容，具有很广泛的应用，比如金融上很多指标的基本原理也是如此。

一般音频的采样率（Sample Rate）都是`44100`或者`48000`，这里我们就以`44100`为例。
>前文我设置窗口大小为1024：1s包含的窗口数：44100 / 1024 = 43
>
>一个窗口所代表的时间为：1000 / (44100 / 1024) = 23.21ms
>
>那么需要以0.5s为区间计算均值，需要的窗口数约为22个。这里取前10个窗口+后10个窗口计算均值。

我们可以分析出音乐的节拍（[代码看这里](https://github.com/fengyuan-liang/audio-analysis/blob/master/src/com/badlogic/audio/samples/part8/PeakDetection.java)）

![image-20230611204836652](https://cdn.fengxianhub.top/resources-master/202306112048957.png)

高的位置就是节拍（Peak Detection）所在了

如果想知道节拍的卡点时间（[代码看这里](https://github.com/fengyuan-liang/audio-analysis/blob/master/src/com/badlogic/audio/samples/part8/Peak.java)），我们可以这样计算

```java
for (int i = 0; i < spectralFlux.size(); i++) {
    int start = Math.max(0, i - THRESHOLD_WINDOW_SIZE);
    int end = Math.min(spectralFlux.size() - 1, i + THRESHOLD_WINDOW_SIZE);
    float mean = 0;
    for (int j = start; j <= end; j++)
        mean += spectralFlux.get(j);
    mean /= (end - start);
    float thresholdValue = mean * MULTIPLIER;
    if (spectralFlux.get(i) > thresholdValue && currentBeatTime - lastBeatTime > 0.2) {
        // 当前位置是一个卡点
        beatTimestamps.add(currentBeatTime);
        lastBeatTime = currentBeatTime;
    }
    currentBeatTime += samples.length / 44100f;
}
```

效果就是这样的（单位秒）：

```java
Beat timestamps:
1.35
1.67
1.97
2.32
2.62
2.95
3.27
3.58
3.88
4.53
4.83
5.04
5.46
5.78
6.59
7.04
7.36
7.66
8.01
8.31
8.61
8.94
9.26
9.57
9.89
10.19
10.52
10.82
11.15
11.47
12.10
12.42
12.72
13.05
13.35
13.58
14.00
14.30
14.63
15.26
15.60
15.88
16.51
16.83
17.14
18.41
18.74
19.04
19.99
20.32
20.62
20.94
21.90
22.20
22.45
22.83
23.78
24.01
24.33
24.57
24.82
25.68
25.98
26.31
26.63
27.56
27.89
28.21
28.51
29.47
29.79
30.09
30.42
30.74
31.05
31.37
31.83
32.16
32.44
32.95
33.25
33.58
33.88
34.20
34.69
35.16
35.46
35.78
36.11
37.04
37.38
37.69
37.99
38.48
38.94
39.27
39.57
39.89
40.10
40.84
41.15
41.47
41.77
42.26
42.72
43.05
43.38
43.68
44.33
44.63
45.26
45.58
46.05
46.37
46.83
47.30
47.79
48.41
48.76
49.04
49.37
49.67
49.99
50.29
50.62
50.94
51.25
51.57
51.90
52.20
52.52
52.83
53.15
53.45
53.78
54.08
54.40
54.73
55.03
55.36
55.68
55.98
56.31
56.61
56.94
57.26
57.56
57.89
58.19
58.51
58.84
59.14
59.47
59.77
60.09
60.42
60.72
61.05
61.67
62.30
62.55
62.95
63.25
63.58
63.90
64.20
64.53
64.83
65.32
65.78
66.11
66.41
66.73
67.06
67.36
67.66
67.99
68.31
68.61
68.94
69.26
69.57
69.89
70.19
70.52
70.84
71.15
71.47
71.77
72.10
72.42
73.05
73.35
73.68
74.00
74.30
74.63
74.93
75.25
75.56
75.88
76.37
76.83
77.16
77.46
77.78
78.11
78.41
78.71
79.04
79.36
79.67
79.99
80.62
80.94
81.24
81.57
81.87
82.20
82.52
82.82
83.15
83.45
83.77
84.10
84.40
84.73
85.03
85.35
85.68
85.98
86.31
86.61
86.93
87.26
87.56
87.88
88.19
88.51
88.84
89.14
89.46
89.79
90.09
90.74
91.04
91.67
91.99
92.46
92.92
93.25
93.57
93.87
94.20
94.52
94.83
95.15
95.45
95.78
96.10
96.40
96.73
97.03
97.36
97.66
97.98
98.31
98.61
98.93
99.26
99.56
99.89
100.19
100.51
100.82
101.14
101.47
101.77
102.09
102.39
102.72
103.04
103.35
103.67
103.97
104.30
104.62
104.92
105.25
105.55
105.88
106.20
106.50
106.83
107.13
107.46
107.78
108.08
108.41
108.73
109.03
109.36
109.66
109.99
110.61
110.94
111.24
111.56
111.87
112.19
112.49
112.82
113.14
113.47
113.77
114.10
114.40
114.72
115.05
```

