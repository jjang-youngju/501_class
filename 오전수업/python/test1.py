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

#1부터 100까지 출력하는데
#3의 배수에서는 윤재영 출력
#5의배수에서는 바보 출력

for i in range(1,101) :
    if i%3==0 and i%5==0:
        print("윤재영바보")
    elif i%3==0 :
        print("윤재영",end="")  # ,end="줄바꿈기능" 
    elif i%5==0 :
        print("바보")
    else :
        print(i)
    
#파이썬 데이터 타입
#리스트, 튜플, 딕셔너리, 셋, 배열

name = ["장영주바보","김지연똥개","윤재영멍총이"]
print(name)
data1 =["김기원장",100,3.14,True]
print(data1)

data2= list(("최윤도서관","변수정과",100))
print(data2)

print(  data2[0]    )
print(  data2[-1]   ) #파이썬에서 인덱스 범위를 벗어나도 잘못된게 아니다. -1이면 역주행해서 마지막꺼로 간다.

data3=["이종빈티지","윤종찬양하라","이지현미밥맛있어","장영주모"]
print(  data3[1:3]  ) #1번인덱스부터 3번인덱스 전까지 출력
print(  data3[:3]   ) #3번인덱스까지
print(  data3[2:]) #2번인덱스부터 마지막까지

#데이터추가방법
data3.append("김지연기하네")
data3.append("윤재영영사랑해")
print(data3)

#데이터삭제방법
data3.remove("장영주모")    #실 데이터를 통해삭제
print(data3)
data3.pop()     # 마지막 데이터 삭제
print(data3)
del data3[2]    #인덱스를 통해 해당 인덱스 삭제
print(data3)
data3.clear()   #리스트 완전 삭제
print(data3)

memo=["나","김지연","은","19세남친을","원한다."]
for me in memo :
    print(me,end="")

memo[3]="대머리 남친을"     #3번인덱스 데이터 변경
print()
for me in memo :
    print(me,end="")

memo[1:4]=["장영주","는","목발을"]  #1부터 4전까지의 데이터 변경
print()
for me in memo:
    print(me,end="")

memo.insert(3,"드러운 어그와")

print(  memo  )

memo1=["이종빈","윤재영","변수정"]
memo2=["장영주부","김지연세많음","이지현왕언니"]
memo1.extend(memo2)
print(memo1)

print(  len(memo1)  )

# 리스트생성
# 1.memo = ["a","b","c"]
# 2.memo = list(("장","영","주","땡"))
# 데이터추가 memo.append("리정수")
# 데이터삽입 memo.insert(2,"김민정수리")
# 데이터삭제 
# 삭제 데이터지정 memo.remove("땡")
# 마지막 데이터 삭제 memo.pop()
# 인덱스로 삭제 del memo[3]
# 리스트 합치기 emo.extend(리스트)
# 리스트 크기 len()
# 갯수 구하기 memo.count("장") - 장 이라는 데이터가 몇개 있냐?
# 인덱스 찾기 memo.index("영") - 영 이라는 데이터는 몇번 인덱스냐?
# 정렬 memo.sort() - 오름차순, memo.sort(reverse=True) -내림차순
# 반전 memo.reverse()

info501=["장영주는 폭력적이다.","김지연은 연하만좋아한다.","윤재영은 옆반쌤을좋아한다",
            "최윤도는 영주불행이 행복하다.","수정이는 생일이라 코딩이 싫데,,,","종빈이는 지금 게임한다."]
#501호 딸기반 학생 이름을 input으로 입력받기
#info501에 해당 학생 이름이 있다면 학생의 정보를 출력하시오.

berry = input("딸기반 학생 이름을 입력해주세요 : ")

for i in info501 :
    if berry in i :
        print(i)

# 문제2) info501에서 좋아한다 문구가 있는 정보들 모두 출력

for i in info501 :
    if "좋아한다" in i :
        print(i)

num=[x for x in range(10)]
print(num)














