
#set
# 리스트와 달리 순서없이, 중복없이 사용
# 순서가 없다라는 말은 입력한 순서대로 저장 되있지 않는다.
# 중복제거가 필요한 경우에 사용
# 그룹 구성할때 사용(집합)
# 데이터를 변경할수 없지만 데이터를 제거하고 새데이터 추가 할수 있다.
#set은 {} 로 작성된다.

#set 생성

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