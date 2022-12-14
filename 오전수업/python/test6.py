
#딕셔너리 - 사전
# 파이썬 딕셔너리, 자바에서는 Map
# key : value

dic = {'이름':'이순신','나이':24,'직업':'군인'}
print(dic)
print(dic['이름'])
# 키로 사용가능 - 문자열, 정수, 실수, 불(True,False)
# 키 사용불가 - 리스트, set, 딕셔너리
# value 사용 - 아무거나 다

dic = {}    #이거는 set 아니고 딕셔너리로 인식
dic = dict()    #딕셔너리 생성

dic1 = dict(이름='김지연',나이=29,직업='마이쥬판매원')
print(dic1)

dic2 = dict([('이름','이지현'),('나이',26),('특징','알면서')])
print(dic2)

dic3 = dict(zip(['이름','나이','관심분야'],['윤재영',25,'컴퓨터선생님']))
print(dic3)

print(dic3['이름'])
dic3['관심분야']='지연이누나'
print(dic3)

dic3['싫어하는것'] ='옆반선생님'
print(dic3)

if '이름' in dic3 :
    print("너의이름은 : {0}".format(dic3['이름']))
else :
    print("존재하지않는키입니다.")

"""
#딕셔너리 키 몇개?
print(len(dic3))

title = ["캐릭터명","생명력","코딩기술","잔머리","수학능력","공간능력","지능지수"]
data=[]
for x in title :
    data.append(input(x+":"))

#print(data)

info= dict(zip(title,data))
print(info)

for x in info :
    print(x) #딕셔너리의 키 출력

for x in info :
    print(info[x]) #딕셔너리의 value 출력

for x in info.values():
    print(x) # 딕셔너리의 value출력

for key in info.keys():
    print(key) # 딕셔너리의 key출력

for k,v in info.items():
    print(k,v) #딕셔너리의 key,value 출력


title = ["이름","키","몸무게","관심분야"]

#5명의 정보를 입력한다.
info = []
for i in range(5):
    data=[]
    for t in title:
        data.append(input(t+":"))
    info.append(data)

# 이름을 키로 사용하여 딕셔너리에 5명의 정보를 저장하시오.
dic_info = dict()
for data in info:
    dic_info[data[0]] = dict(zip(title,data))

print(dic_info)


# 이름,번호,c언어성적,java성적,react성적,DB성적,지적수준
# 10명의 성적을 딕셔너리에 저장하시오

# title = ["이름","번호","c언어성적","java성적","react성적","DB성적","지적수준"]
# info = []
# for i in range(10):
#     data=[]
#     for t in title:
#         data.append(input(t+":"))
#     info.append(data)

# print(info)
"""

#쌤이 푼답
keys = ["이름","번호","c언어성적","java성적","react성적","DB성적","지적수준"]
values = list() #입력한 값을 리스트에 저장하고 그 리스트를 저장할 리스트
for i in range(3): #10명 입력해야되니까 10번 반복
    temp = list() # 입력한 값이 저장될 리스트
    for k in keys: # 한명에 대한 정보 입력 for문
        temp.append(input(k))
    values.append (temp)

class501 = dict()
for v in values:
    class501[v[0]] = dict(zip(keys,v)) #딕셔너리 이름을 key, 모든 데이터를 value

# 위 내용을 토대로 입력한 성적들의 평균 점수(지적수준 빼고)를 구하여 이름은 key, value는
# 평균점수와 지적수준을 딕셔너리에 저장

#첫번째 방법
avg=list()
dic_avg = dict()
for k in class501: # name에는 키로사용한 이름이 저장
    sum=0
    for a in class501[k]: # a에는 이름, 번호, 성적들,
        if a=="이름" or a=="번호" or a=="지적수준":
            continue
        sum = sum+int(class501[k][a]) # 한명의 성적 총합 구하기
    
    dic_avg[k] = dict(평균점수=sum/4,지적수준=class501[k]['지적수준'])

print(dic_avg)

"""
#딕셔너리의 key만 리스트로 변환
#li = list(dic.keys())
#딕셔너리의 value만 리스트로 변환
#li=list(dic.values())
#딕셔너리의 key,value를 리스트로변환
#li=list(dic.items())
#key와 value를 한쌍으로 튜플형태로 저장
#[('k1':'v1'),('k2':'v2')]

#두번째방법
avg=list()
dic_avg=dict()
for name in class501: #name에 키로 사용한 이름이 저장
    sum=0
    title=list(class501[name].keys()) #딕셔너리의 키를 리스트로 변환
    for i in range(2,6):
        sum=sum+int(class501[name][title[i]])
    dic_avg[name] = dict(평균점수=sum/4,지적수준=class501[name]['지적수준'])

print(dic_avg)


"""
avg=list()
dic_avg=dict()
for name in class501: #name에 키로 사용한 이름이 저장
    sum=0
    score=list(class501[name].values()) #딕셔너리의 값을 리스트로 변환
    for i in range(2,6):
        sum=sum+int(score[i])
    dic_avg[name] = dict(평균점수=sum/4,지적수준=class501[name]['지적수준'])

print(dic_avg)

#print(class501)

#문의제목, 작성자, 문의내용, 작성일, 답변, 답변일
# 딕셔너리에 저장하는데 키는 번호를 사용, 파일에서 읽어드린 순서대로 1번부터 부여

file=[]
with open("c:/test/question.txt","r",encoding="utf-8") as f :
    file = f.readlines()

for i in range(len(file)) : 
    file[i] = file[i][:len(file[i])-1]  # 문자열 슬라이싱 "banana"[2:] → "nana", "banana"[2:4] →"na"
                                        # "banana"[:4] → "bana"
    file[i] = file[i].split(" ")

key=['문의제목','작성자','문의내용','작성일','답변','답변일']

qus=dict()
for i in range(len(file)):
    qus[i+1]=dict(zip(key,file[i]))

print(qus)

# 문제
# 작성자 또는 제품명으로 검색하여 해당 문의글의 전체 출력하기
# 출력예시
# 작성자 : 윤재명
# 제목 : 출마선언합니다.
# 작성일 : 2027-03-10
# 문의글 : 대선출정하고싶습니다.도와주세요.
# ============================================
#답변 : 1억 있어요?
# 답변일 : 2027-02-05

for i in qus:
    print("{0}.{1}{2}".format(i,qus[i]["문의제목"],qus[i]["작성일"]))

search = int(input("번호 :"))

print("작성자 : {0} \n제목 : {1}".format(qus[search]['작성자'],qus[search]['문의제목']))
print("작성일 : {0}\n문의글 :{1}".format(qus[search]['작성일'],qus[search]['문의내용']))
print("===========================================================")
print("답변 : {0}\n답변일 :{1}".format(qus[search]['답변'],qus[search]['답변일']))
