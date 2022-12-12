
#f = open("c:/test/question.txt","r",encoding="utf-8") #쓰기 -w, 읽기 -r, 추가 -a

#line = f.readlines() #파일 전체를 읽어오기, 한줄씩 가져와서 리스트에 저장
#line = f.readline() #파일 한줄읽기 
#line = f.read() # 파일전체 읽기
#print(line)

#f.close() #파일을 열어서 다읽었다면 닫아야한다.
"""
file=[]
with open("c:/test/question.txt","r",encoding="utf-8") as f :
    file = f.readlines()

for i in range(len(file)) : 
    file[i] = file[i][:len(file[i])-1]  # 문자열 슬라이싱 "banana"[2:] → "nana", "banana"[2:4] →"na"
                                        # "banana"[:4] → "bana"
    file[i] = file[i].split(" ")

print(file)


#작성자 또는 제품명으로 검색하여 해당 문의글의 전체 출력하기
# 출력예시
# 작성자 : 윤재명
# 제목: 출마선언합니다.
# 작성일 : 2027-03-10
# 문의글 : 대선출정하고싶습니다.도와주세요
#==================================================
# 답변 : 1억있어요?
# 답변일 : 2027-03-15


file=[]
with open("c:/test/question.txt","r",encoding="utf-8") as f :
    file = f.readlines()

for i in range(len(file)) : 
    file[i] = file[i][:len(file[i])-1]                  
    file[i] = file[i].split(" ")

s = input("작성자 또는 제품명을 입력해주세요.")
for answer in file:
    for k in answer:
        if s in k :
            print("작성자 : "+answer[1])
            print("제목 : "+answer[0])
            print("작성일 : "+answer[3])
            print("문의글 : "+answer[2])
            print("===================================")
            print("답변 : "+answer[4])
            print("답변일 : "+answer[5])

#쌤이 푼답
search = input("작성자 또는 제품명 :")

for qus in file :
    for i in range(len(qus)) :
        if search in qus[i] :
            print("작성자 : {0} \n제목 : {1}\n작성일 : {2}\n문의글 :{3}".format(qus[0],qus[1],qus[3],qus[2]))
            print("===========================================================")
            print("답변 : {0}\n답변일 :{1}".format(qus[4],qus[5]))
            break
"""

#튜플 - 리스트처럼 데이터를 저장해두는 구조이다.
#       리스트처럼 여러데이터를 복합적으로 저장 가능하다.
#       하지만 튜플은 리스트와 다르게 변경이 안된다.
#       데이터 변경이 안될뿐 나머지는 리스트와 동일하다.
# 리스트의 표현태그는 []이고, 튜플은 ()이다.
# 튜플은 데이터의 갯수가 고정적으로 제한 되어있는경우 또는 데이터가 변경되지 않아야 하는 경우에 사용

# 튜플생성
tu = "새신발","밟혔다."
print(tu)
print(type(tu))
tu2=("그래서","주먹으로쳤다")
print(tu2)
tu3=("아프다")
print(type(tu3))

tu4=("하녀복장",)
print(type(tu4))

tu5 =("그리고","난","발목을차였다","혼신의주먹을날릴뻔")
a,b,c,d =tu5
print(a,b,c,d)
print(tu5[2])   #튜플 인덱스사용
print(tu5[1:])  #튜플 슬라이싱 1번인덱스부터 끝까지 출력
#tu5.append("추가?") 새 데이터 추가 안됨
#tu5[0]="엘베에서" 데이터변경안됨
print(tu5.count("난")) # 지정데이터가 몇개 있냐?
print(tu5.index("발목을차였다")) #지정데이터는 몇번 인덱스에 있냐?

#튜플은 리스트에 비해 벅은 메모리 사용
#튜플은 리스트에 비해 접근 속도 빠르다

























