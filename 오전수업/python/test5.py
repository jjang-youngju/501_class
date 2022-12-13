import random

#set
# 리스트와 달리 순서없이, 중복없이 사용
# 순서가 없다라는 말은 입력한 순서대로 저장 되있지 않는다.
# 중복제거가 필요한 경우에 사용
# 그룹 구성할때 사용(집합)
# 데이터를 변경할수 없지만 데이터를 제거하고 새데이터 추가 할수 있다.
#set은 {} 로 작성된다.

#set 생성

"""
set1 = {"사과","배","참외","배"," 배"}
print( set1 )

set2 = set("member")
print(set2)

set3 = set("장영죽이가 죽을 먹었다. 근데 장영죽이가 죽을 먹다가 체했다.")
print(set3)

set4 = set(("장영실이","수도원옷을","입었다."))
print(set4)

#print( set[0] ) 인덱스를 사용하여 set 데이터 접근 불가

for s in set4 : 
    print(s)

print( "장영주가" in set4 ) # set 내부에 지정데이터가 있는지 확인

set4.add("김진연은")
print(set4)

set5 = { "안경을 쓰고 있다.","그래서","겨울에는 장님이 된다."}
set4.update(set5)
print(set4)
list1=["장영주는","화가많다."]
set4.update(list1)  #리스트뿐만 아니라 튜플, 딕셔너리도 가능
print(set4)

#set 데이터 삭제하기
set4.remove("그래서") # remove는 삭제 데이터가 없으면 오류 발생
print(set4)
set4.discard("장영주는") # discard는 삭제데이터가 없으면 오류 NO
print(set4)
a=set4.pop() # 마지막 데이터를 추출 삭제, 마지막 데이터를 추출하여 밖으로 빼고 set에서는 삭제
print(set4)
print(a)
set4.clear() #set을 비움
del set4 #set을 완전 삭제

#집합
장영주팀 ={"김기원","김민서","김민정","최윤도","정다현","임성민","이지현","이종빈"}
김지연팀 ={"윤재영","이정수","윤종찬","변수정","최윤도","이지현","전계림","연하남친"}

a=장영주팀-김지연팀 #차집합
print(a)
b= 장영주팀|김지연팀 #합집합
print(b)
c=김지연팀&장영주팀 #교집합
print(c)
d=장영주팀^김지연팀 #합집합에서 교집합 빼기
print(d)

a=장영주팀.difference(김지연팀) #차집합
# 장영주팀.difference(김지연팀) #차집합-장영주팀의 데이터가 변경됨
b=장영주팀.intersection(김지연팀) #교집합
# 장영주팀.intersection(김지연팀) #교집합-장영주팀의 데이터가 변경됨
c=장영주팀.symmetric_difference(김지연팀) #합집합
#장영주팀.symmetric_difference_update(김지연팀) #합집합-장영주팀의 데이터가 변경됨
"""

이정수팀장={"김기원","최윤도","장영주","이종빈","정다현","김유신","한석봉","윤재영"}
이지현팀장={"김지연","윤재영","윤종찬","변수정","김유신","한석봉","이순신"}

#이정수 팀원들 중에 스파이색출하기

스파이=이정수팀장.intersection(이지현팀장)
print("스파이 : {0}".format(스파이))

#순수 이정수팀장에게 충성하는 팀원
충신=이정수팀장-이지현팀장 #이정수팀장.difference(이지현팀장)
print("이정수에게 충성맹세한자 : {0}".format(충신))

전계림추종자={"장영주","윤재영","김지연","이종빈"}

#이지현팀장만을 바라보는 사람들
이바사 = 이지현팀장-이정수팀장
이바사 = 이바사-전계림추종자
print("완전한 이지현 사람들 : {0}".format(이바사))

#그르면 문제 문제 문제
# today Question 1.
# Extract 10 data without duplicaton in the following random range(1~50)
# 랜덤 범위(1~50) 중에서 중복없이 10개데이터 뽑아내기 그리고 출력

a = set()

while len(a) < 10:
    ran = random.randint(1,50)
    a.add(ran)

print(sorted(a))

num={random.randint(1,50)}
while 10!=len(num):
    num.add(random.randint(1,50))

print(num)

member=[ ["김춘추","01012345678","남"],["김지연","01098765432","여"],["이순신","01075319512","남"],
         ["하지원","01074108520","여"],["전계림","01096308520","남"],["전지현","01045617891","여"],
         ["윤재순","01032165498","여"],["이지현","01095236842","남"],["이요원","01099178235","여"]]

names=[]
for x in member :
    names.append(x[0]) #member 이름만 가져오기

tempSet = set(names)

print("======= 회원가입 =========")
name = input("이름 : ")
#a=len(set)
#set.add(name)
#if a!=len(set)
print(tempSet)
setName={name}
#print(set(name).issubset(tempSet))
while setName.issubset(tempSet):    #issubset() - 지정한 set안에 값이 포함되어있냐?
    print("이름중복입니다.다시입력하세요")
    name = input("이름 : ")

#issuperset() - a.issuperset(b) b가 a에 모두 있냐?
#A가B에 포함되어있냐?
#A.issubset(b) 또는 b.issuperset(a)
tel = input("연락처 : ")
gender = input("성별 : ")

member.append([name,tel,gender])
print(member)

#문제2) 회원가입을 하는데 이름이 중복되지않게 회원가입 될수 있도록 만들기
#hint a=[1,2,3,4,5] a=set(b)















