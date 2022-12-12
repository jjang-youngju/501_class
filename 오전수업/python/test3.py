import random

name = ["김유신","이순신","어영담","이성계","장영실","홍길동","김지연","김춘추"]
job = ["군인","국회의원","과학자","도둑","건설업자","밸리댄서","변호사"]
age =[24,35,37,21,28,41,29,35,42]

info =[]

for i in range(10) :
    info.append([random.choice(name),random.choice(job),random.choice(age)])

# info 리스트로 작업하기
# 1. 직업이 군인인 사람은 누구인지 이름출력 ○
# 2. 직업이 과학자인 사람들의 평균 나이 출력 △
# 3. 나이가 이십대인 사람들의 직업은 무엇인지 출력하기 ○

군인=[]
for i in info :
    if i[1]=="군인" :
        군인.append(i[0])

print(군인)

sum=0
count=0
avg=0
for i in info :
    if i[1]=="과학자" :
       sum+=i[2]
       count+=1

if count != 0 :
    avg=sum/count
    print(avg)

age20 = []
for i in info :
    if i[2]>=20 and i[2]<30 :
        age20.append(i[1])

print(age20)

#쌤 답
for people in info :
    if "군인" in people :
        print(people[0])

age=0
cnt=0
for people in info :
    if "과학자" in people :
        age +=people[2]
        cnt +=1
if cnt != 0 :
    print("과학자 평균 나이 : ",str(age/cnt))
else : 
    print("과학자가 없다.")

for people in info :
    if int(int(people[2])/10)==2 :
        print(people[1])

#랜덤 사용방법
#random.randint(1,40) → 1~40중에서 랜덤

a=[] # 랜덤범위 1~30
b=[] # 랜덤범위 10~50
c=[] # 랜덤범위 1~100

num=[]
#a,b,c 리스트에 각각 15개씩 랜덤범위에 맞춰서 저장하기
#a,b,c 리스트의 값중에서 중복인 값만 찾아서 num 리스트에 저장하기
#중복값이 하나도 없다면 중복없다 라고 출력

for i in range(15) :
    a.append(random.randint(1,30))
    b.append(random.randint(10,50))
    c.append(random.randint(1,100))

for x in a:     #a리스트의 값을 하나씩 하나씩 x에 저장
    if x in b :     #x 변수의 값이 리스트 b에 있냐?
        if x in c :     # x변수의 값이 리스트 b에는 있는데 리스트 c에도 있냐?
            num.append(x)

if len(num) != 0 : #len(num) → num리스트의 크기값이 0이라면 없다. not num → num이 비었다면 false
    print(num)
else:
    print("num은 비었다.")

word = ["boy","table","book","girl","interest","limit","endless","mission",
        "hopi","tigerprint"]

eng=["a","b","c","d","e","f","g","h","i","j","k","l","m","n","o","p","q","r",
     "s","t","u","v","w","x","y","z"]

# eng 리스트의 알파벳을 무작위 조합해서 word 리스트의 단어 중 1개이상 나오는경우
# 몇 번째 조합에서 나오는지 출력

me =""
cnt=0

while True :
    for i in range(random.randint(3,10)) :
        me+=random.choice(eng)
    cnt+=1
    if me in word :
        break
    me=""
print(me,cnt)

#쌤이푼거

cnt = 0
temp = ""
while True:
    word_cnt = random.randint(3,10)
    wemp = ""
    for i in range(word_cnt):
        temp += random.choice(eng)
    cnt+=1
    if temp in word:
        break

print(temp+"    "+ str(cnt))