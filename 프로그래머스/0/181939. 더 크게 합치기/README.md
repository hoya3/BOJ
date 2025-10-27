# [level 0] 더 크게 합치기 - 181939 

[문제 링크](https://school.programmers.co.kr/learn/courses/30/lessons/181939) 

### 성능 요약

메모리: 80.6 MB, 시간: 1.83 ms

### 구분

코딩테스트 연습 > 코딩 기초 트레이닝

### 채점결과

정확성: 100.0<br/>합계: 100.0 / 100.0

### 제출 일자

2025년 10월 28일 03:59:41

### 문제 설명

<p style="font-family: &quot;Pretendard JP&quot;;">연산 ⊕는 두 정수에 대한 연산으로 두 정수를 붙여서 쓴 값을 반환합니다. 예를 들면 다음과 같습니다.</p>

<ul>
<li>12 ⊕ 3 = 123</li>
<li>3 ⊕ 12 = 312</li>
</ul>

<p style="font-family: &quot;Pretendard JP&quot;;">양의 정수 <code style="font-family: &quot;Pretendard JP&quot;;">a</code>와 <code style="font-family: &quot;Pretendard JP&quot;;">b</code>가 주어졌을 때, <code style="font-family: &quot;Pretendard JP&quot;;">a</code> ⊕ <code style="font-family: &quot;Pretendard JP&quot;;">b</code>와 <code style="font-family: &quot;Pretendard JP&quot;;">b</code> ⊕ <code style="font-family: &quot;Pretendard JP&quot;;">a</code> 중 더 큰 값을 return 하는 solution 함수를 완성해 주세요.</p>

<p style="font-family: &quot;Pretendard JP&quot;;">단, <code style="font-family: &quot;Pretendard JP&quot;;">a</code> ⊕ <code style="font-family: &quot;Pretendard JP&quot;;">b</code>와 <code style="font-family: &quot;Pretendard JP&quot;;">b</code> ⊕ <code style="font-family: &quot;Pretendard JP&quot;;">a</code>가 같다면 <code style="font-family: &quot;Pretendard JP&quot;;">a</code> ⊕ <code style="font-family: &quot;Pretendard JP&quot;;">b</code>를 return 합니다.</p>

<hr>

<h5 style="font-family: &quot;Pretendard JP&quot;;">제한사항</h5>

<ul>
<li>1 ≤ <code style="font-family: &quot;Pretendard JP&quot;;">a</code>, <code style="font-family: &quot;Pretendard JP&quot;;">b</code> &lt; 10,000</li>
</ul>

<hr>

<h5 style="font-family: &quot;Pretendard JP&quot;;">입출력 예</h5>
<table class="table" style="font-family: &quot;Pretendard JP&quot;;">
        <thead><tr>
<th>a</th>
<th>b</th>
<th>result</th>
</tr>
</thead>
        <tbody><tr>
<td>9</td>
<td>91</td>
<td>991</td>
</tr>
<tr>
<td>89</td>
<td>8</td>
<td>898</td>
</tr>
</tbody>
      </table>
<hr>

<h5 style="font-family: &quot;Pretendard JP&quot;;">입출력 예 설명</h5>

<p style="font-family: &quot;Pretendard JP&quot;;">입출력 예 #1</p>

<ul>
<li><code style="font-family: &quot;Pretendard JP&quot;;">a</code> ⊕ <code style="font-family: &quot;Pretendard JP&quot;;">b</code> = 991 이고, <code style="font-family: &quot;Pretendard JP&quot;;">b</code> ⊕ <code style="font-family: &quot;Pretendard JP&quot;;">a</code> = 919 입니다. 둘 중 더 큰 값은 991 이므로 991을 return 합니다.</li>
</ul>

<p style="font-family: &quot;Pretendard JP&quot;;">입출력 예 #2</p>

<ul>
<li><code style="font-family: &quot;Pretendard JP&quot;;">a</code> ⊕ <code style="font-family: &quot;Pretendard JP&quot;;">b</code> = 898 이고, <code style="font-family: &quot;Pretendard JP&quot;;">b</code> ⊕ <code style="font-family: &quot;Pretendard JP&quot;;">a</code> = 889 입니다. 둘 중 더 큰 값은 898 이므로 898을 return 합니다.</li>
</ul>


> 출처: 프로그래머스 코딩 테스트 연습, https://school.programmers.co.kr/learn/challenges