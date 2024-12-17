# Test Scenario ID: `SignUp-1`
## Test Case ID: `SignUp-1A`
- Test Case Description: ตรวจสอบการ Sign up เพื่อสร้าง account
- Test Priority: สำคัญสุด
- Pre-Requisite: NA
- Post-Requisite: Sign up สำเร็จระบบต้อง Sign in ให้อัตโนมัติ

|S.No |Action |Inputs |Expected Output |Actual Output |Test Browser |Test Result |Test Comments |
| ---- | ---- | ---- | ---- | ---- | ---- | ---- | ---- |
|1|เข้าเว็ปไซต์ Medusa Store|<p>https://45.136.236.146/</p><p></p>|<p>โชว์หน้า โฮมเพจของ</p><p>[Medusa Store](https://45.136.236.146/us)</p><p></p>|<p>โชว์หน้า โฮมเพจของ</p><p>[Medusa Store](https://45.136.236.146/us)</p>|Google Chrome|PASS|[Unchitta -21/11/24 ]:สำเร็จ|
|2|ลงทะเบียน account โดยใส่ Email ไม่ถูกหลัก|<p>First name: Tester</p><p>Last name: Testing</p><p>Email: group10.com</p><p>Phone: 0631114569</p><p>Password: test</p>|ขึ้นเตือนว่าใส่ Email ไม่ถูกต้อง|ขึ้นเตือนว่าใส่ Email ไม่ถูกต้อง|Google Chrome|PASS|[Unchitta -21/11/24 ]:สำเร็จ|
|3|ลงทะเบียน account โดยใส่เบอร์โทรศัพท์ไม่ครบ 10 ตัว|<p>First name: Tester</p><p>Last name: Testing</p><p>Email: group10@gmail.com</p><p>Phone: 063111</p><p>Password: test</p>|ขึ้นเตือนว่าใส่เบอร์โทรศัพท์ไม่ถูกต้อง|โชว์หน้า Account ที่ลงทะเบียนสำเร็จ|Google Chrome|Fail|[Unchitta -21/11/24 ]:ไม่สำเร็จ เนื่องจาก สามารถลงทะเบียนได้|
|4|ลงทะเบียน account โดยใส่เบอร์โทรศัพท์เป็นตัวอักษร|<p>First name: Tester</p><p>Last name: Testing</p><p>Email: testgroup10@gmail.com</p><p>Phone: abc</p><p>Password: test</p>|ขึ้นเตือนว่าใส่เบอร์โทรศัพท์ไม่ถูกต้อง|โชว์หน้า Account ที่ลงทะเบียนสำเร็จ|Google Chrome|Fail|[Unchitta -21/11/24 ]:ไม่สำเร็จ เนื่องจาก สามารถลงทะเบียนได้|
|5|ลงทะเบียน account โดยใส่ข้อมูลครบถ้วนถูกต้องทั้งหมด|<p>First name: Tester</p><p>Last name: Testing</p><p>Email: group10@gmail.com</p><p>Phone: 0631114569</p><p>Password: test</p>|ลงทะเบียนสำเร็จ|ลงทะเบียนสำเร็จ|Google Chrome|PASS|[Unchitta -21/11/24 ]:สำเร็จ|
|6|ลงทะเบียน account โดยใส่ Email ที่เคยลงทะเบียนไว้แล้ว|<p>First name: Tester</p><p>Last name: Testing</p><p>Email: group10@gmail.com</p><p>Phone: 0631114569</p><p>Password: test</p>|ขึ้นเตือนว่า Email นี้เคยลงทะเบียนแล้ว|ขึ้นเตือนว่า Email นี้เคยลงทะเบียนแล้ว|Google Chrome|PASS|[Unchitta -21/11/24 ]:สำเร็จ|
|7|ลงทะเบียน account โดยใส่ข้อมูลไม่ครบถ้วน|<p>First name: Tester</p><p>Last name: (ไม่กรอก)</p><p>Email: dstgroup10@gmail.com</p><p>Phone: 0631114569</p><p>Password: test</p>|ขึ้นเตือนว่ายังกรอกข้อมูลไม่ครบถ้วน|ขึ้นเตือนว่ายังกรอกข้อมูลไม่ครบถ้วน|Google Chrome|PASS|[Unchitta -21/11/24 ]:สำเร็จ|


---



# Test Scenario ID: `SignIn-1`
## Test Case ID: `SignIn-1A`
- Test Case Description: ตรวจสอบการ Sign in เข้าสู่ระบบ
- Test Priority: สำคัญสุด
- Pre-Requisite: ผู้ใช้ต้องมี account ก่อน
- Post-Requisite: ข้อมูลส่วนตัวของ account ที่ Sign in ถูกต้องตามที่ลงทะเบียนไว้

|S.No|Action|Inputs|Expected Output|Actual Output|Test Browser|Test Result|Test Comments|
| ---- | ---- | ---- | ---- | ---- | ---- | ---- | ---- |
|1|sign in กรอก Email ที่ไม่เคยลงทะเบียนไว้ & กรอกรหัสผ่าน และกดปุ่ม Sign in|<p>Email: <invalid@gmail.com></p><p>Password: 12345</p>|ขึ้นเตือนว่า Email หรือ password ผิด|ขึ้นเตือนว่า Email หรือ password ผิด|Google Chrome|PASS|[Unchitta -21/11/24 ]:สำเร็จ|
|2|sign in กรอก Email ที่เคยลงทะเบียนไว้แล้ว & กรอกรหัสผ่านผิด และกดปุ่ม Sign in|<p>Email: group10[@gmail.com](mailto:invalid@gmail.com)</p><p>Password: 12345</p>|ขึ้นเตือนว่า Email หรือ password ผิด|ขึ้นเตือนว่า Email หรือ password ผิด|Google Chrome|PASS|[Unchitta -21/11/24 ]:สำเร็จ|
|3|sign in กรอก Email ที่เคยลงทะเบียนไว้แล้ว & กรอกรหัสผ่านถูกและกดปุ่ม |<p>Email: group10[@gmail.com](mailto:invalid@gmail.com)</p><p>Password: test</p>|sign in สำเร็จ|sign in สำเร็จ|Google Chrome|PASS|[Unchitta -21/11/24 ]:สำเร็จ|

---

# Test Scenario ID: `Order-1`
## Test Case ID: `Order-1A`
- Test Case Description: ตรวจสอบการเพิ่มสินค้าลงตะกร้าจนถึงการสั่งซื้อสำเร็จ
- Test Priority: สำคัญสุด
- Pre-Requisite: ผู้ใช้ต้องล็อกอินก่อน
- Post-Requisite: สินค้าควรไม่มีอยู่หลังตะกร้าหลังชำระเงินสำเร็จ

|S.No|Action|Inputs|Expected Output|Actual Output|Test Browser|Test Result|Test Comments|
| ---- | ---- | ---- | ---- | ---- | ---- | ---- | ---- |
|1|กดปุ่ม Menu|-|แสดงเมนูเมื่อกดปุ่ม|เมนูถูกแสดงเมื่อกดปุ่ม|Google Chrome|PASS|[Sukkamit -21/11/24 ]:สำเร็จ|
|2|เลือก Store|-|แสดงหน้าร้านค้า|แสดงหน้าร้านค้า|Google Chrome|PASS|[Sukkamit -21/11/24 ]:สำเร็จ|
|3|เลือก จัดเรียงราคาจาก น้อย -> มาก|-|สินค้าจัดเรียงตามราคา|สินค้าจัดเรียงตามราคา|Google Chrome|PASS|[Sukkamit -21/11/24 ]:สำเร็จ|
|4|เลือกสินค้าชิ้นแรก|-|แสดงรายละเอียดสินค้า|แสดงรายละเอียดสินค้า|Google Chrome|PASS|[Sukkamit -21/11/24 ]:สำเร็จ|
|5|กดปุ่ม Add to Cart|-|สินค้าถูกเพิ่มลงตะกร้า|สินค้าเพิ่มลงตะกร้าสำเร็จ|Google Chrome|PASS|[Sukkamit -21/11/24 ]:สำเร็จ|
|6|กดปุ่ม Go to cart|-|แสดงรายละเอียดของตะกร้าสินค้า|แสดงรายละเอียดของตะกร้าสินค้า|Google Chrome|PASS|[Sukkamit -21/11/24 ]:สำเร็จ|
|7|ปรับจำนวนสินค้าในตะกร้า|จำนวนสินค้า: เพิ่มเป็น 10 แล้วลดเหลือ 4|จำนวนสินค้าปรับได้ และราคาเปลี่ยนแปลงถูกต้อง|จำนวนสินค้าปรับได้ และราคาเปลี่ยนแปลงถูกต้อง|Google Chrome|PASS|[Sukkamit -21/11/24 ]:สำเร็จ|
|8|กดปุ่ม Go to checkout|-|แสดงหน้ากรอกข้อมูลสำหรับจัดส่ง|แสดงหน้ากรอกข้อมูลสำหรับจัดส่ง|Google Chrome|PASS|[Sukkamit -21/11/24 ]:สำเร็จ|
|9|กรอกข้อมูลสำหรับจัดส่ง (ข้อมูลไม่ถูกต้อง)|First Name: aa, Last Name: bb, Address: 11/22, Postal Code: abcde, City: abc, Country: US, State: BBA, Phone: abc|- ขี้นเตือนว่า รูปแบบของ รหัสไปรษณีย์ และ เบอร์โทรศัพท์ ผิดพลาด|สามารถกดไปยังหัวข้อ Delivery ได้|Google Chrome|Fail|[Sukkamit -21/11/24 ]:ไม่สำเร็จ เนื่องจาก สามารถกดบันทึกข้อมูลได้ทั้งที่ Format ผิด|
|10|กรอกข้อมูลสำหรับจัดส่ง (ข้อมูลถูกต้อง)|First Name: aa, Last Name: bb, Address: 11/22, Postal Code: 12345, City: abc, Country: US, State: BBA, Phone: 112233|<p>- ไปยังหัวข้อ Delivery</p><p></p>|เลื่อนจอไปยังหัวข้อ Delivery|Google Chrome|PASS|[Sukkamit -21/11/24 ]:สำเร็จ|
|11|เลือกรูปแบบการจัดส่ง|FakeEx Express|<p>- สามารถเลือกการจัดส่งได้ </p><p>- ไปยังหัวข้อ Payment  </p>|สามารถเลือกการจัดส่งได้|Google Chrome|PASS|[Sukkamit -21/11/24 ]:สำเร็จ|
|12|เลือกวิธีการชำระเงิน|Payment Method: Credit Card|ไปยังหัวข้อ Review |สามารถเลือกวิธีชำระเงินได้|Google Chrome|PASS|[Sukkamit -21/11/24 ]:สำเร็จ|
|13|กดปุ่ม Place Order|-|แสดงหน้าสั่งซื้อสำเร็จ|สามารถแสดงรายละเอียดสินค้าที่ซื้อ|Google Chrome|PASS|[Sukkamit -21/11/24 ]:สำเร็จ|

---

# Test Scenario ID: `EditProfile-1`
## Test Case ID: `EditProfile-1A`
- Test Case Description: ตรวจสอบการแก้ไขข้อมูลส่วนตัวของ
- Test Priority: สำคัญ
- Pre-Requisite: ผู้ใช้ต้องล็อกอินก่อน
- Post-Requisite: ข้อมูลต้องอัปเดตได้ตรงกับที่แก้ไขไป

|S.No|Action|Inputs|Expected Output|Actual Output|Test Browser|Test Result|Test Comments|
| ---- | ---- | ---- | ---- | ---- | ---- | ---- | ---- |
|1|แก้ไข firstname และกดปุ่ม save changes|<p>จาก Tester เป็น Tester001&</p><p></p>|firstname ของ account เปลี่ยนเป็น Tester001&|firstname ของ account เปลี่ยนเป็น Tester001&|Google Chrome|PASS|[Jirawat -21/11/24 ]:สำเร็จ|
|2|<p>แก้ไข lastname และกดปุ่ม save changes</p><p></p>|จาก Testing เป็น Testing001&|lastname ของ account เปลี่ยนเป็น Testing001&|lastname ของ account เปลี่ยนเป็น Testing001&|Google Chrome|PASS|[Jirawat -21/11/24 ]:สำเร็จ|
|4|แก้ไข email เป็น email ที่ไม่ถูกหลัก และกดปุ่ม save changes|จาก <group10@gmail.com> เป็น group10|แก้ไข email ไม่สำเร็จ|แก้ไข email ไม่สำเร็จ|Google Chrome|PASS|[Jirawat -21/11/24 ]:สำเร็จ|
|5|<p>แก้ไข email เป็น email ที่ถูกต้องและกดปุ่ม save changes</p><p></p>|จาก <group10@gmail.com> เป็น dstgroup10@gmail.com|email ของ account เปลี่ยนเป็น dstgroup10@gmail.com|ขึ้นข้อความ ‘something wrong please contract admin’|Google Chrome|Fail|[Jirawat -21/11/24 ]:ไม่สำเร็จ เนื่องจากได้รับข้อความ "something wrong"|
|6|แก้ไข Phone เป็นตัวเลขที่เกิน 10 ตัว|จาก 0631114569 เป็น 063123456789|ไม่สามารถแก้ไข Phone ได้|แก้ไข Phone สำเร็จ|Google Chrome|Fail|[Jirawat -21/11/24 ]:ไม่สำเร็จ เนื่องจาก สามารถแก้ไขเป็นเบอร์โทรศัพท์ที่ Format ผิดได้|
|7|แก้ไข Phone เป็นตัวอักษรและน้อยกว่า 10 ตัวอักษร|จาก 063123456789 เป็น aabbcc|ไม่สามารถแก้ไข Phone ได้|แก้ไข Phone สำเร็จ|Google Chrome|Fail|[Jirawat -21/11/24 ]:ไม่สำเร็จ เนื่องจาก สามารถแก้ไขเป็นเบอร์โทรศัพท์ที่ Format ผิดได้|
|8|แก้ไข Password โดยกรอก Old password ไม่ถูกต้อง|<p>Real old password: test</p><p>Old password ที่กรอก: 1234</p><p>New password: newpass</p><p>Confirm new password: newpass</p>|ไม่สามารถแก้ไข password ได้และขึ้นเตือนว่ากรอกรหัสผ่านเก่าผิด|ไม่สามารถแก้ไข password ได้และขึ้นเตือนว่ากรอกรหัสผ่านเก่าผิด|Google Chrome|PASS|[Jirawat -21/11/24 ]:สำเร็จ|
|9|แก้ไข Password โดยกรอก Old password ถูกต้อง แต่กรอก New password กับ Confirm new password ไม่ตรงกัน|<p>Real old password: test</p><p>Old password ที่กรอก: test</p><p>New password: newpass</p><p>Confim new password: testnewpass</p>|<p>ไม่สามารถแก้ไข password ได้และขึ้นเตือนว่ากรอกรหัสผ่านใหม่ไม่ตรงกัน</p><p></p>|<p>ไม่สามารถแก้ไข password ได้และขึ้นเตือนว่ากรอกรหัสผ่านใหม่ไม่ตรงกัน</p><p></p>|Google Chrome|PASS|[Jirawat -21/11/24 ]:สำเร็จ|
|10|แก้ไข Password โดยกรอก Old password ถูกต้อง และกรอก New password กับ Confirm new password ตรงกัน|<p>Real old password: test</p><p>Old password ที่กรอก: test</p><p>New password: newpass</p><p>Confirm new password: newpass</p>|แก้ไข Password สำเร็จ|แก้ไข Password สำเร็จ|Google Chrome|PASS|[Jirawat -21/11/24 ]:สำเร็จ|

---

# Test Scenario ID: `Search-1`
## Test Case ID: `Search-1A`
- Test Case Description: ตรวจสอบการค้นหาสินค้าในระบบด้วยชื่อสินค้า
- Test Priority: สำคัญ
- Pre-Requisite: NA
- Post-Requisite: NA

|S.No|Action|Inputs|Expected Output|Actual Output|Test Browser|Test Result|Test Comments|
| ---- | ---- | ---- | ---- | ---- | ---- | ---- | ---- |
|1|search ชื่อสินค้าที่ไม่มีอยู่ในระบบ|pencil|ไม่โชว์สินค้าสักรายการ|400 bad request|Google Chrome|Fail|[Jirawat -21/11/24 ]:ไม่สำเร็จ เนื่องจาก เมื่อทำการ Search ถูกส่งไปยังหน้า 400 bad request|
|2|search ชื่อสินค้าที่มีอยู่ในระบบด้วยชื่อเต็ม|<p>Medusa Longsleeve[](https://45.136.236.146/us/products/longsleeve)</p><p>[](https://45.136.236.146/us/products/longsleeve)</p><p></p>|โชว์สินค้า Medusa Longsleeve|400 bad request|Google Chrome|Fail|[Jirawat -21/11/24 ]:ไม่สำเร็จ เนื่องจาก เมื่อทำการ Search ถูกส่งไปยังหน้า 400 bad request|
|3|search ชื่อสินค้าที่มีอยู่ในระบบด้วย keyword|Coffee|โชว์สินค้า Medusa Coffee Mug|400 bad request|Google Chrome|Fail|[Jirawat -21/11/24 ]:ไม่สำเร็จ เนื่องจาก เมื่อทำการ Search ถูกส่งไปยังหน้า 400 bad request|
|4|search ชื่อสินค้าที่มีอยู่ในระบบด้วยตัวพิมพ์ใหญ่|MEDUSA|โชว์สินค้าทุกรายการที่มีคำค้นหาอยู่ในชื่อสินค้า|400 bad request|Google Chrome|Fail|[Jirawat -21/11/24 ]:ไม่สำเร็จ เนื่องจาก เมื่อทำการ Search ถูกส่งไปยังหน้า 400 bad request|
|5|search ชื่อสินค้าที่มีอยู่ในระบบด้วยตัวพิมพ์เล็ก|medusa|โชว์สินค้าทุกรายการที่มีคำค้นหาอยู่ในชื่อสินค้า|400 bad request|Google Chrome|Fail|[Jirawat -21/11/24 ]:ไม่สำเร็จ เนื่องจาก เมื่อทำการ Search ถูกส่งไปยังหน้า 400 bad request|
