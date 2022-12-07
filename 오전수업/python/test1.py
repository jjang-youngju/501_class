#출력 - print()
#입력 - input()
#변수 - num=10  그냥 타입없이 변수만
#타입변환 - str() 문자열, int() 정수, float() 실수
#출력포멧 - print("{0}".format(10)), print("{0} {1}".format(10,"변수정"))

#문제1)
#시속 vk/h로 달리고 있는 자동차가 반지름 rkm인 원형트랙을 달리고 있다면
# 한바퀴 완주하는데 걸리는 시간은 몇분인가? 소수점한자리까지 출력
#자동차 속도와 반지름을 입력하여 구하기
"""
v = int(input("속도를 입력하세요 : "))
r = int(input("반지름을 입력하세요 : "))

dist = r*2*3.14    #트랙길이
time = dist/v *60
print("완주시간 :{0}분".format(time))   # print("완주시간 :" +str(time))
"""
# 문제2)
# 소주 한잔에 수명이 2분 단축된다.
#지연이가 소주를 20년동안 마셨다.
#그렇다면 지연이는 수명이 총 몇분 줄었는가?
#                       총 몇시간?
#                       총 몇일?
#하루에 소주를 몇잔 마시는지 입력하여 세가지 구하여 출력
"""
day = int(input("하루에 마신 잔수 : "))
m = day*20*365*2
h = m/60
d = h/24
print("줄어든 수명시간 : {0}분".format(m))
print("줄어든 수명시간 :{0}시간".format(h))
print("줄어든 수명일 : {0}일".format(d)) 
"""
"""
x,y,z = "김지연","장영주","변수정"
a=b=c= "연하남친"
favorite = ["목발","선인장","19남친"]   #리스트
a,b,c = favorite
print(a)
print(b)
print(c)
"""
"""
    같다 → ==, 같지않다 → !=, > < >= <=
"""
""" num = 19
num1 = 27

if num1 > num : 
    print("누난 내 여자니까!")
else : 
    print("누나 늙었어...")
print("여기는 그냥 출력")

if num1 > num:
    print("연하가 좋아")

age = 22

if age > num : 
    print("내가 형이니까 내가 가지겠어 누나!")
elif num > age : 
    print("내가 더 연하야!")
else : 
    print("둘다 싫어! 난 이제 연상이 좋아")

name = "김지연"

print("미안합니다..그만할께요") if name == "김지연" else print("농일세") if num1 != 27 else print("뻥인데 계속할껀데") """


#문제3)
# 지연이와 기원이가 오락실에 갔다. 둘이 오붓하게 펀치게임을 하였다.
#지연이와 기원이의 펀치 점수가 각각 얼마인지 입력하여 누가 이겼는지 출력하시오.

ji = int(input("지연이 점수 : "))
gi = int(input("기원이 점수 : "))

if ji > gi : 
    print("지연이 승")
elif ji < gi: 
    print ("기원이 승")
else :
    print("비겼으")

#문제4)
# 영주하고 지연이하고 수정이가 시험을 봤다. 세명의 시험점수를 입력하고 세명의점수 총합 평균 등급이 어떻게 되는지 출력하기
# 90점 이상은 A, 80점 이상은 B, 70점 이상은 C, 나머지 점수는 '떼잉 ,,쯧!' 출력하기.

young = int(input("영주 등급 : "))
yeon = int(input("지연 등급 : "))
joung = int(input("수정 등급 : "))

score = (young+yeon+joung)/3

if score >=90 :
    print("A등급")
elif score >=80 : 
    print("B등급")
elif score >=70 :
    print("C등급")
else :
    print("떼잉..쯧!")

i=1
while i<=10:
    print(1)
    i+=1

#구구단 4단출력 해보세요
#4*1=4 → 이렇게 출력하기
a=1
while a<=9 :
    #print("4*{0}={1}".format(a,4*a))
    print("4*"+str(a)+"="+str(4*a))
    a+=1

i=1
while True :
    print(i)
    if i == 100: break
    i+= 1


#while문 마지막 문제
#배꼽지연이가 연하남친을 만나려고 버스를 타려고 교통카드를 10000원을 충전하였다.
# 지연이가 버스를 몇번 탈수 있는가? 잔액은 얼마인가?
#버스요금은 1200원 반드시 while문을 사용할것

card = 10000
bus = 1200
count = 0

while card >= bus :
    card-=bus
    count+=1
else : 
    print("잔액 : {0}, 탑승횟수: {1}".format(card,count))

for i in range(1,10,3) :
    print(i)

for i in range(1,10) :
    print("8*{0}={1}".format(i,8*i))
    
#45부터 109까지 출력하시오
for i in range(45,110) :
    print(i)

영주 = 151
지연 = 19

print("영주는 " + str(영주) + "cm라고 해달라고 했고 지연이는 " + str(지연) + "살을 좋아한다. 사실이다 ㄷㄷ;; 누나 나 오늘 석식먹고 갈것 같아" )