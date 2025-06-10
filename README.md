# config

client config 변경시 https://github.com/nhnacademy-be09-ink3/ink3-config 레포지토리에서 수정 <br>

config server에 변경 반영 <br>
{server ip}/actuator/refresh 에 POST 요청 <br>
<pre><code>curl -X POST http://ink3.shop/config/actuator/refresh \
  -H "Content-Type: application/json" \
  -H "Accept: application/json" \
  -H "User-Agent: Mozilla/5.0 (Windows NT 10.0; Win64; x64)"
 </code></pre> <br><br>
이미 배포된 서버에서 변경사항 있을시 config client들에 전파(merge 후 재배포되는 경우 할 필요 없음) <br>
{server ip}/actuator/busrefresh 에 POST 요청 <br>
<pre><code>curl -X POST http://ink3.shop/config/actuator/busrefresh \
  -H "Content-Type: application/json" \
  -H "Accept: application/json" \
  -H "User-Agent: Mozilla/5.0 (Windows NT 10.0; Win64; x64)"
 </code></pre> <br><br>
