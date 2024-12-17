# Average-load test
### ทดสอบโหลดเฉลี่ยภายใต้การใช้งานปกติ

stages: [

{ duration: '1m', target: 10 }, // 10 users ramping up

{ duration: '3m', target: 10 }, // 10 users steady

{ duration: '1m', target: 0 },  // Ramp down to 0

],

![Screenshot 2024-11-23 145924](https://github.com/user-attachments/assets/db5a402a-4ea1-46c7-b7bb-65f8d3058cac)

- duration : 2.18 s 
- iterations : 1124 
- vus : 1 
- max : 10 
- data\_received : 70 MB 
- data\_sent : 273 kB
- http\_req\_duration : 591.03 ms 
- http\_reqs : 2248

**1. Response Time**

- ค่าเฉลี่ยของ http\_req\_duration คือ 591.03 ms

**2. Wait Time**

- ค่าเฉลี่ยของ http\_req\_waiting คือ 583.45 ms

**3. Average Load Time**

- ค่าเฉลี่ยของ iteration\_duration คือ 2.18 s

**4. Peak Response Time** 

- ค่าสูงสุดของ http\_req\_duration คือ 5.17 s

**5. Error Rate**

- http\_req\_failed คือ 0% (100% ของ request สำเร็จ)

`สรุป` 
1. เว็บไซต์มีความเสถียรดี เพราะไม่มี request ที่ล้มเหลว
2. มี Response Time และ Wait Time สูง แสดงว่าเซิร์ฟเวอร์ใช้เวลาในการประมวลผลและส่ง response กลับนาน
3. เวลาการโหลดเฉลี่ย (2.18 s) อาจไม่เหมาะสำหรับผู้ใช้งานที่คาดหวังการตอบสนองที่รวดเร็ว

---

# Soak testing
### ทดสอบความเสถียรของระบบภายใต้โหลดคงที่ในระยะยาว

stages: [

{ duration: '1m', target: 50 },  // Ramp up to 50 users

{ duration: '30m', target: 50 }, // Hold steady at 50 users for 30 minutes

{ duration: '1m', target: 0 },   // Ramp down to 0

],

![Screenshot 2024-11-24 011909](https://github.com/user-attachments/assets/acf51a0e-059e-4ce2-a128-514e7f60731d)

- duration : 7.81 s 
- iterations : 11924 
- vus : 1 
- max : 50
- data\_received : 747 MB
- data\_sent : 2.9 kB
- http\_req\_duration : 3.4 s
- http\_reqs : 23848

**1. Response Time**

- ค่าเฉลี่ยของ http\_req\_duration คือ  3.4 s

**2. Wait Time**

- ค่าเฉลี่ยของ http\_req\_waiting คือ 3.38 s

**3. Average Load Time**

- ค่าเฉลี่ยของ iteration\_duration คือ 7.81 s 

**4. Peak Response Time** 

- ค่าสูงสุดของ http\_req\_duration คือ 15.7 s

**5. Error Rate**

- http\_req\_failed คือ 0% (100% ของ request สำเร็จ)

`สรุป` 
1. เวลาการตอบสนองช้า ทั้ง Response Time และ Load Time สูงเกินกว่าที่เหมาะสม อาจทำให้ประสบการณ์ผู้ใช้ไม่ราบรื่นและโหลดหน้าเว็บนาน
2. ระบบยังเสถียรเนื่องจากไม่มี request ใดล้มเหลว

---

# Spike testing
### ทดสอบความสามารถของระบบในการรับมือกับการเพิ่มขึ้นของโหลดอย่างฉับพลัน

stages: [

{ duration: '10s', target: 10 },  // Ramp up to 10 users

{ duration: '10s', target: 500 }, // Spike to 500 users

{ duration: '20s', target: 10 },  // Drop back to 10 users

{ duration: '10s', target: 0 },   // Ramp down to 0

],

![Screenshot 2024-11-24 004421](https://github.com/user-attachments/assets/b75aeebe-a77b-4b42-9618-181ee66f0890)

- duration : 25.75 s 
- iterations : 201 
- vus : 1
- max : 500 
- data\_received : 13 MB 
- data\_sent : 344 kB
- http\_req\_duration : 6.86 s 
- http\_reqs : 787

**1. Response Time**

- ค่าเฉลี่ยของ http\_req\_duration คือ 6.86 s

**2. Wait Time**

- ค่าเฉลี่ยของ http\_req\_waiting คือ 6.86 s

**3. Average Load Time**

- ค่าเฉลี่ยของ iteration\_duration คือ 25.75 s

**4. Peak Response Time** 

- ค่าสูงสุดของ http\_req\_duration คือ 59.82 s 

**5. Error Rate**

- http\_req\_failed คือ 1.90% (15 out of 787)

`สรุป` 
1. เวลาการตอบสนองและเวลาการโหลดช้ามากในช่วง Spike แสดงให้เห็นว่าเซิร์ฟเวอร์ไม่สามารถปรับตัวให้รองรับ spike load ได้ดี
2. การจัดการโหลดไม่เพียงพอเกิด Error Rate (1.90%) บ่งบอกถึงข้อจำกัดของระบบเมื่อเผชิญกับการเพิ่มจำนวนผู้ใช้งานอย่างรวดเร็ว

---

# Stress testing
### ทดสอบความสามารถของระบบเมื่อมีการโหลดเพิ่มขึ้นอย่างต่อเนื่อง

stages: [

{ duration: '2m', target: 50 },  // Ramp up to 50 users

{ duration: '3m', target: 100 }, // Ramp up to 100 users

{ duration: '2m', target: 200 }, // Ramp up to 200 users

{ duration: '1m', target: 0 },   // Ramp down to 0 users

],

![Screenshot 2024-11-23 152321](https://github.com/user-attachments/assets/aff44e91-1f0f-490c-81f4-6318a188a820)

- duration : 23.84 s 
- iterations : 1790 
- vus : 4
- max : 200
- data\_received : 113 MB 
- data\_sent : 500 kB
- http\_req\_duration : 11.38 s 
- http\_reqs : 3605

**1. Response Time**

- ค่าเฉลี่ยของ http\_req\_duration คือ 11.38 s 

**2. Wait Time**

- ค่าเฉลี่ยของ http\_req\_waiting คือ 11.37 s

**3. Average Load Time**

- ค่าเฉลี่ยของ iteration\_duration คือ 23.84 s

**4. Peak Response Time** 

- ค่าสูงสุดของ http\_req\_duration คือ 48.24 s

**5. Error Rate**

- http\_req\_failed คือ 0% (100% ของ request สำเร็จ)

`สรุป` 
1. ระบบสามารถรับโหลดได้แต่ช้ามาก เพราะไม่มี request ที่ล้มเหลว แต่เวลาตอบสนองช้ามาก
2. ระบบยังเสถียรเนื่องจากไม่มี request ใดล้มเหลว
3. Peak Response Time สูงเกินไป (48.24 วินาที) ชี้ให้เห็นว่าเซิร์ฟเวอร์ไม่สามารถรองรับ stress load ได้ดีและเป็นเวลาที่ไม่เหมาะสมสำหรับการใช้งานจริง
