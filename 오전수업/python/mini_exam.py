
# 미니 시험
# 문제)

# (c:/test 폴더에 member.txt) txt 문서에 다음과 같은형태로 데이터 20개 작성하기
# 번호 이름 연락처 이메일 성별 주소(동,읍,면까지만 입력)

#위 txt파일을 읽어오기
# 딕셔너리에 저장하기(키,value 알아서)
#   1. 이메일의 도메인이 몇개이고 뭐뭐있는지 출력하기(중복없이) - 도메인은 naver.com,google.com 이런거
#   2. naver.com 도메인의 이메일을 사용하는 사람들이 사는 도시이름만 출력하기
#   3. 성별이 여자인 사람중에서 대전중구에 사는 사람은 누구인가? 모두출력하기


#함수
# - 파일읽기 함수
# - 파일 읽어서 딕셔너리에 저장하는 함수
# 1. 함수 - 이메일에서 도메인 분리하는 함수, 중복제거하고 출력하는 함수
# 2. naver.com인 사람찾는 함수
# 3. 성별로 찾는 함수( 꼭 여자만 찾을수 있으면 안됨, 남자를 찾고싶으면 찾기가 되야한다. , 코드수정없이)

#이메일에서 도메인 분리하는 함수

def dmain(email):
    dm=[]
    for i in email:
        dm.append(i[1])
    print(set(dm))

def domain(file):
    email=[]
    for f in file:
        email.append(f[3].split("@"))
    print(email)
    dmain(email)

#naver.com 도메인의 이메일을 사용하는 사람들이 사는 도시이름만 출력하기
def city(file):
    email=[]
    for i in file:
        if "naver.com" in i[3]:
            email.append(i[5])
    print(set(email))

#성별이 여자인 사람중에서 대전중구에 사는 사람은 누구인가?
def gender(file):
    girl=[]
    # gd=input("성별을 입력하세요.")
    for f in file:
        if f[4]=="여" and "대전광역시" in f[5] and "중구" in f[6]:
            girl.append(f)
    print(girl)


#파일 딕셔너리저장
def member(file):
    key=['번호','이름','연락처','이메일','성별','주소','구','동']
    member = dict()
    for i in range(len(file)):
         member[i+1]=dict(zip(key,file[i]))
    for k in member:
        print("{0}".format(member[k]))
    gender(file)
    city(file)
    domain(file)

#파일읽기함수

def file():
    file=[]
    with open("c:/test/member.txt","r",encoding="utf-8") as f :
        file = f.readlines()

    for i in range(len(file)) : 
        file[i] = file[i][:len(file[i])-1]
                                    
        file[i] = file[i].split(" ")
    member(file)
file()