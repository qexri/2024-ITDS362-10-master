# Unit Test Explanation  
### Group 10 (2024-ITDS362-10)

## Member List:
- **6587009	Jirawat	Ornsri**
- **6587011	Chonthicha	Preecharak**
- **6587021	Preyaporn	Tangsri**
- **6587036	Sukkamit	Sinarpa**
- **6587046	Unchitta	Aryuyong**
- **6587067	Aorakanya	Intrapreeda**
  
---

# Test suit 1

### ชื่อ `testSetRandomShape`

#### จุดประสงค์: เพื่อตรวจสอบว่ารูปร่าง Tetromino ที่ถูกสุ่มขึ้นมาจากตัวเลขเป็นรูปร่างที่ถูกต้อง (e.g., L\_SHAPE, T\_SHAPE).

#### 1. Identify testable functions: `void setRandomShape()`
#### 2. Identify parameters, return types, return values, and exceptional behavior
- Parameters: -
- Return type: void
- Return value: -
- Exceptional behavior: หากค่า x ที่สุ่มออกมามีค่าต่ำกว่า 1 หรือสูงกว่า 7 (เช่น ค่า x = 0 หรือ 8) จะเกิดข้อผิดพลาด

### Interface-based
#### 3. Model the input domain
- Develop characteristics
    - C1 = ค่า x จาก Random อยู่ระหว่าง 1 - 7
- Partition characteristics

  |Characteristic| b1   | b2    |
  |-----|------|-------|
  | **C1** = ค่า x จาก Random | True | False |

- Identify (possible) values

  |Characteristic| b1 | b2 |
  |-----|----|----|
  | **C1** = ค่า x จาก Random | 2  | 8  |

#### 4. Combine partitions into tests
- Assumption: Multiple Base Choice
- Test requirements -- number of tests (upper bound) =  2

  True, False


#### 5. Derive test values

| Test  | ค่า x จาก Random | Expected result                          |
|-------|------------------|------------------------------------------|
| T1    | 2                | Tetrominoes ได้รับการตั้งค่าเป็น S_SHAPE |
| T2    | 8                | Exception (Out of range)                 |


### Functionality-based
#### 3. Model the input domain
- Develop characteristics

    - C1 = ค่า x จาก Random
- Partition characteristics

  | Characteristic             | b1   | b2  | b3  | b4  | b5 | b6 | b7 |
  |----------------------------|------|-----|-----|-----|----|----|----|
  | **C1** = ค่า x จาก Random  | 1   | 2   | 3   | 4  | 5  | 6  | 7  |

- Identify (possible) values

  | Characteristic             | b1   | b2  | b3  | b4  | b5 | b6 | b7 |
  |----------------------------|------|-----|-----|-----|----|----|----|
  | **C1** = ค่า x จาก Random  | 1   | 2   | 3   | 4  | 5  | 6  | 7  |

#### 4. Combine partitions into tests
- Assumption: Multiple Base Choice
- Test requirements -- number of tests (upper bound) = 7

  1, 2, 3, 4, 5, 6, 7

#### 5. Derive test values

| Test | x | Expected result                          |
|------|---|------------------------------------------|
| T1   | 1 | Tetrominoes ได้รับการตั้งค่าเป็น Z_SHAPE |
| T2   | 2 | Tetrominoes ได้รับการตั้งค่าเป็น S_SHAPE |
| T3   | 3 | Tetrominoes ได้รับการตั้งค่าเป็น I_SHAPE |
| T4   | 4 | Tetrominoes ได้รับการตั้งค่าเป็น T_SHAPE |
| T5   | 5 | Tetrominoes ได้รับการตั้งค่าเป็น O_SHAPE |
| T6   | 6 | Tetrominoes ได้รับการตั้งค่าเป็น L_SHAPE |
| T7   | 7 | Tetrominoes ได้รับการตั้งค่าเป็น J_SHAPE |


---

# Test suit 2
### ชื่อ `testGetShape`

#### จุดประสงค์: เพื่อตรวจสอบว่าฟังก์ชันคืนค่า tetrominoes ที่ถูกต้อง (e.g., L\_SHAPE, T\_SHAPE).

#### 1. Identify testable functions: `Tetrominoes getShape()`
#### 2. Identify parameters, return types, return values, and exceptional behavior
- Parameters: -
- Return type: Tetrominoes
- Return value: tetrominoes (NO_BLOCK, Z_SHAPE, S_SHAPE, I_SHAPE, T_SHAPE, O_SHAPE, L_SHAPE, J_SHAPE)
- Exceptional behavior: หาก tetrominoes ยังไม่ได้ถูกเซ็ต (ค่าคือ NO_BLOCK), ฟังก์ชันจะคืนค่า NO_BLOCK.

### Interface-based
#### 3. Model the input domain
- Develop characteristics
    - C1 = tetrominoes ถูกเซ็ทค่าแล้ว
- Partition characteristics

  |Characteristic| b1   | b2    |
  |-----|------|-------|
  | **C1** = tetrominoes ถูกเซ็ทค่าแล้ว | True | False |

- Identify (possible) values

  |Characteristic| b1   | b2  |
  |-----|------|-----|
  | **C1** = tetrominoes ถูกเซ็ทค่าแล้ว | T_SHAPE | ... |

#### 4. Combine partitions into tests
- Assumption: Multiple Base Choice
- Test requirements -- number of tests (upper bound) = 2

  True, False

#### 5. Derive test values

| Test  | เซ็ทค่า tetrominoes | Expected result |
|-------|---------------------|-------|
| T1    | ไม่ได้เซ็ท          | คืนค่า NO_BLOCK         |
| T2    | T_SHAPE             | คืนค่า T_SHAPE  |

### Functionality-based
#### 3. Model the input domain
- Develop characteristics

    - C1 = tetrominoes จาก setShape() หรือ setRandomShape()
- Partition characteristics

  |Characteristic| b1 | b2 | b3 | b4 | b5 | b6 |b7 | b8 |
  |----- |-----|-----|-----|-----|-----|-----|-----|-----|
  | **C1** = tetrominoes จาก setShape() หรือ setRandomShape() | NO_BLOCK | Z_SHAPE | S_SHAPE | I_SHAPE | T_SHAPE | O_SHAPE | L_SHAPE | J_SHAPE |

- Identify (possible) values

  |Characteristic| b1 | b2 | b3 | b4 | b5 | b6 |b7 | b8 |
  |----- |-----|-----|-----|-----|-----|-----|-----|-----|
  | **C1** = tetrominoes จาก setShape() หรือ setRandomShape() | NO_BLOCK | Z_SHAPE | S_SHAPE | I_SHAPE | T_SHAPE | O_SHAPE | L_SHAPE | J_SHAPE |

#### 4. Combine partitions into tests
- Assumption: Multiple Base Choice
- Test requirements -- number of tests (upper bound) =  8

  NO_BLOCK, Z_SHAPE, S_SHAPE, I_SHAPE, T_SHAPE, O_SHAPE, L_SHAPE, J_SHAPE

#### 5. Derive test values

| Test  | tetrominoes จาก setShape() หรือ setRandomShape() | Expected result |
|-------|--------------------------------------------------|-----------------|
| T1    | NO_BLOCK                                         | คืนค่า NO_BLOCK |
| T2    | Z_SHAPE                                          | คืนค่า Z_SHAPE  |
| T3    | S_SHAPE                                          | คืนค่า S_SHAPE  |
| T4    | I_SHAPE                                          | คืนค่า I_SHAPE  |
| T5    | T_SHAPE                                          | คืนค่า T_SHAPE  |
| T6    | O_SHAPE                                          | คืนค่า O_SHAPE  |
| T7    | L_SHAPE                                          | คืนค่า L_SHAPE  |
| T8    | J_SHAPE                                          | คืนค่า J_SHAPE  |

---
# Test suit 3

### ชื่อ `testSetX`

#### จุดประสงค์: เพื่อตรวจสอบว่าสามารถกำหนดแกน X ให้กับบล็อกของ Tetromino ได้ถูกต้อง

#### 1. Identify testable functions: `void setX(int idx, int x)`
#### 2. Identify parameters, return types, return values, and exceptional behavior
- Parameters: idx, x
- Return type: void
- Return value: -
- Exceptional behavior:
    - หาก idx อยู่เกินขอบเขตของอาร์เรย์ coords จะเกิด ArrayIndexOutOfBoundsException
    - หาก x มีค่าเกินขอบเขตของบอร์ดเกม อาจทำให้เกิดบั๊กในการแสดงผลของบล็อกบนกระดาน

### Interface-based
#### 3. Model the input domain
- Develop characteristics
    - C1 = ค่า idx – ดัชนีที่กำหนดใน coords
    - C1 = ค่า x – ค่า x ที่ตั้งไว้ใน coords[idx][0]
- Partition characteristics

  | Characteristic | b1  | b2 | b3  |
  |----------------|-----|----|-----|
  | **C1** = idx   | < 0 | 0  | \>0 |
  | **C2** = x     | < 0 | 0  | \>0 |

- Identify (possible) values

  | Characteristic | b1 | b2  | b3 |
  |----------------|----|-----|----|
  | **C1** = idx   | -1 | 0   | 2  |
  | **C2** = x     | -1 | 0   | 3  |

#### 4. Combine partitions into tests
- Assumption: Base Choice
- Test requirements -- number of tests (upper bound) = 5

  base choice: (0, 0)
  test: (0, 0), (0, -1), (0, 3), (-1,0), (2,0)

#### 5. Derive test values

| Test | ค่า idx | ค่า x | Expected result    |
|------|---------|-------|--------------------|
| T1   | 0       | 0     | coords[0][0] = 0;  |
| T2   | 0       | -1    | coords[0][0] = -1; |
| T3   | 0       | 3     | coords[0][0] = 3;  |
| T4   | -1      | 0     | coords[-1][0] = 0; |
| T5   | 2       | 0     | coords[2][0] = 0;  |

### Functionality-based
#### 3. Model the input domain
- Develop characteristics
    - C1 = idx อยู่ในขอบเขตที่ถูกต้องของอาร์เรย์ coords (0-3)
- Partition characteristics

  | Characteristic              | b1   | b2    |
  |-----------------------------|------|-------|
  | **C1** = idx อยู่ในขอบเขตที่ถูกต้องของอาร์เรย์ coords (0-3) | True | False |

- Identify (possible) values

  | Characteristic              | b1 | b2 |
  |-----------------------------|----|----|
  | **C1** = idx อยู่ในขอบเขตที่ถูกต้องของอาร์เรย์ coords (0-3) | 0  | 5  |

#### 4. Combine partitions into tests
- Assumption: Base Choice
- Test requirements -- number of tests (upper bound) = 2

  True, False

#### 5. Derive test values

| Test  | ค่า idx | Expected result          |
|-------|---------|--------------------------|
| T1    | 0       | coords[0][0] = x;        |
| T2    | 5       | Exception (Out of range) |

---
# Test suit 4

### ชื่อ `testSetY`

#### จุดประสงค์: เพื่อตรวจสอบว่าสามารถกำหนดแกน Y ให้กับบล็อกของ Tetromino ได้ถูกต้อง

#### 1. Identify testable functions: `void setX(int idx, int x)`
#### 2. Identify parameters, return types, return values, and exceptional behavior
- Parameters: idx, x
- Return type: void
- Return value: -
- Exceptional behavior:
    - หาก idx อยู่เกินขอบเขตของอาร์เรย์ coords จะเกิด ArrayIndexOutOfBoundsException
    - หาก y มีค่าเกินขอบเขตของบอร์ดเกม อาจทำให้เกิดบั๊กในการแสดงผลของบล็อกบนกระดาน

### Interface-based
#### 3. Model the input domain
- Develop characteristics
    - C1 = ค่า idx – ดัชนีที่กำหนดใน coords
    - C1 = ค่า y – ค่า y ที่ตั้งไว้ใน coords[idx][1]
- Partition characteristics

  | Characteristic | b1  | b2 | b3  |
  |----------------|-----|----|-----|
  | **C1** = idx   | < 0 | 0  | \>0 |
  | **C2** = y     | < 0 | 0  | \>0 |

- Identify (possible) values

  | Characteristic | b1 | b2  | b3 |
  |----------------|----|-----|----|
  | **C1** = idx   | -1 | 0   | 2  |
  | **C2** = x     | -1 | 0   | 3  |

#### 4. Combine partitions into tests
- Assumption: Base Choice
- Test requirements -- number of tests (upper bound) = 5

  base choice: (0, 0)
  test: (0, 0), (0, -1), (0, 3), (-1,0), (2,0)

#### 5. Derive test values

| Test | ค่า idx | ค่า x | Expected result    |
|------|---------|-------|--------------------|
| T1   | 0       | 0     | coords[0][1] = 0;  |
| T2   | 0       | -1    | coords[0][1] = -1; |
| T3   | 0       | 3     | coords[0][1] = 3;  |
| T4   | -1      | 0     | coords[-1][1] = 0; |
| T5   | 2       | 0     | coords[2][1] = 0;  |

### Functionality-based
#### 3. Model the input domain
- Develop characteristics
    - C1 = idx อยู่ในขอบเขตที่ถูกต้องของอาร์เรย์ coords (0-3)
- Partition characteristics

  | Characteristic              | b1   | b2    |
  |-----------------------------|------|-------|
  | **C1** = idx อยู่ในขอบเขตที่ถูกต้องของอาร์เรย์ coords (0-3) | True | False |

- Identify (possible) values

  | Characteristic              | b1 | b2 |
  |-----------------------------|----|----|
  | **C1** = idx อยู่ในขอบเขตที่ถูกต้องของอาร์เรย์ coords (0-3) | 0  | 5  |

#### 4. Combine partitions into tests
- Assumption: Base Choice
- Test requirements -- number of tests (upper bound) = 2

  True, False

#### 5. Derive test values

| Test  | ค่า idx | Expected result          |
|-------|---------|--------------------------|
| T1    | 0       | coords[0][1] = x;        |
| T2    | 5       | Exception (Out of range) |

---
# Test suit 5

### ชื่อ `testGetX`

#### จุดประสงค์: เพื่อตรวจสอบว่าสามารถคืนค่าแกน X ของบล็อกของ Tetromino ได้ถูกต้อง

#### 1. Identify testable functions: `int getX(int idx)`
#### 2. Identify parameters, return types, return values, and exceptional behavior
- Parameters: idx
- Return type: int
- Return value: ค่าของ coords[idx][0]
- Exceptional behavior: หาก idx อยู่เกินขอบเขตของอาร์เรย์ coords จะก่อให้เกิด ArrayIndexOutOfBoundsException

### Interface-based
#### 3. Model the input domain
- Develop characteristics
    - C1 = ค่า idx
- Partition characteristics

  | Characteristic | b1  | b2 | b3  |
  |----------------|-----|----|-----|
  | **C1** = idx   | < 0 | 0  | \>0 |

- Identify (possible) values

  | Characteristic             | b1 | b2 | b3 |
  |----------------------------|----|----|----|
  | **C1** = ค่า idx | -1 | 0  | 1  |

#### 4. Combine partitions into tests
- Assumption: All Combinations
- Test requirements -- number of tests (upper bound) =  3

  <0, 0, \>0

#### 5. Derive test values

| Test | idx | Expected result      |
|------|-----|----------------------|
| T1   | -1  | คืนค่า coords[-1][0] |
| T2   | 2   | คืนค่า coords[2][0]  |
| T3   | 5   | คืนค่า coords[1][0]  |


### Functionality-based
#### 3. Model the input domain
- Develop characteristics

    - C1 = idx อยู่ในขอบเขตที่ถูกต้องของอาร์เรย์ coords (0-3)
- Partition characteristics

  | Characteristic              | b1   | b2    |
  |-----------------------------|------|-------|
  | **C1** = idx อยู่ในขอบเขตที่ถูกต้องของอาร์เรย์ coords (0-3) | True | False |

- Identify (possible) values

  | Characteristic          | b1 | b2 |
  |-------------------------|---|---|
  | **C1** = idx อยู่ในขอบเขตที่ถูกต้องของอาร์เรย์ coords (0-3)  | 2 | 5 |

#### 4. Combine partitions into tests
- Assumption: All Combinations
- Test requirements -- number of tests (upper bound) =  2

  True, False

#### 5. Derive test values

| Test | idx | Expected result                     |
|------|-----|-------------------------------------|
| T1   | 2   | คืนค่า coords[2][0]                 |
| T2   | 5   | Exception (Out of range) |

---
# Test suit 6

### ชื่อ `testGetY`

#### จุดประสงค์: เพื่อตรวจสอบว่าสามารถคืนค่าแกน Y ของบล็อกของ Tetromino ได้ถูกต้อง

#### 1. Identify testable functions: `int getY(int idx)`
#### 2. Identify parameters, return types, return values, and exceptional behavior
- Parameters: idx
- Return type: int
- Return value: ค่าของ coords[idx][1]
- Exceptional behavior: หาก idx อยู่เกินขอบเขตของอาร์เรย์ coords จะก่อให้เกิด ArrayIndexOutOfBoundsException

### Interface-based
#### 3. Model the input domain
- Develop characteristics
    - C1 = ค่า idx
- Partition characteristics

  | Characteristic | b1  | b2 | b3  |
  |----------------|-----|----|-----|
  | **C1** = idx   | < 0 | 0  | \>0 |

- Identify (possible) values

  | Characteristic             | b1 | b2 | b3 |
  |----------------------------|----|----|----|
  | **C1** = ค่า idx | -1 | 0  | 1  |

#### 4. Combine partitions into tests
- Assumption: All Combinations
- Test requirements -- number of tests (upper bound) =  3

  <0, 0, \>0

#### 5. Derive test values

| Test | idx | Expected result      |
|------|-----|----------------------|
| T1   | -1  | คืนค่า coords[-1][1] |
| T2   | 2   | คืนค่า coords[2][1]  |
| T3   | 5   | คืนค่า coords[1][1]  |


### Functionality-based
#### 3. Model the input domain
- Develop characteristics

    - C1 = idx อยู่ในขอบเขตที่ถูกต้องของอาร์เรย์ coords (0-3)
- Partition characteristics

  | Characteristic              | b1   | b2    |
  |-----------------------------|------|-------|
  | **C1** = idx อยู่ในขอบเขตที่ถูกต้องของอาร์เรย์ coords (0-3) | True | False |

- Identify (possible) values

  | Characteristic          | b1 | b2 |
  |-------------------------|---|---|
  | **C1** = idx อยู่ในขอบเขตที่ถูกต้องของอาร์เรย์ coords (0-3)  | 2 | 5 |

#### 4. Combine partitions into tests
- Assumption: All Combinations
- Test requirements -- number of tests (upper bound) =  2

  True, False

#### 5. Derive test values

| Test | idx | Expected result          |
|------|-----|--------------------------|
| T1   | 2   | คืนค่า coords[2][1]      |
| T2   | 5   | Exception (Out of range) |

---
# Test suit 7

### ชื่อ `testMinX`

#### จุดประสงค์: เพื่อตรวจสอบว่า minX() คืนค่าตำแหน่งขั้นต่ำของ Tetromino ในแกน X ได้ถูกต้อง

#### 1. Identify testable functions: public int minX()
#### 2. Identify parameters, return types, return values, and exceptional behavior
- Parameters: ไม่มี (ใช้พิกัดของ Tetromino ที่ตั้งค่าไว้)
- Return type: int
- Return value: ค่าตำแหน่งต่ำสุดของแกน X
- Exceptional behavior: หาก Tetromino มีรูปทรงไม่ถูกต้อง เช่น รูปร่างที่ไม่รู้จักหรือค่าที่ผิดปกติ จะคืนค่า -1 หรือแสดงข้อความแสดงความผิดพลาด

### Interface-based
#### 3. Model the input domain
- Develop characteristics
    - C1 = Tetromino shape (รูปร่างของ Tetromino ที่ใช้ทดสอบ)
- Partition characteristics

| Characteristic         | b1       | b2      | b3       | b4       | b5       | b6       | b7       | b8       |
|------------------------|----------|---------|----------|----------|----------|----------|----------|----------|
| C1 = Tetromino shape   | NO_BLOCK | Z_SHAPE | S_SHAPE  | I_SHAPE  | T_SHAPE  | O_SHAPE  | L_SHAPE  | J_SHAPE  |

- Identify possible values

| Characteristic         | b1       | b2      | b3       | b4       | b5       | b6       | b7       | b8       |
|------------------------|----------|---------|----------|----------|----------|----------|----------|----------|
| C1 = Tetromino shape   | NO_BLOCK | Z_SHAPE | S_SHAPE  | I_SHAPE  | T_SHAPE  | O_SHAPE  | L_SHAPE  | J_SHAPE  |

#### 4. Combine partitions into tests
- Assumption: Each Choice
- Test requirements -- number of tests (upper bound): 8
  (NO_BLOCK), (Z_SHAPE), (S_SHAPE), (I_SHAPE), (T_SHAPE), (O_SHAPE), (L_SHAPE), (J_SHAPE)

#### 5. Derive test values
| Test | 	Tetromino shape	  | Expected result for minX() |
|------|-----------------------|----------------------------|
| T1	  | NO_BLOCK	          | -1                         |         
| T2	  | Z_SHAPE	              | -1                         |         
| T3	  | S_SHAPE	              | 0                          |          
| T4	  | I_SHAPE	              | 0                          |          
| T5	  | T_SHAPE	              | -1                         |         
| T6	  | O_SHAPE	              | 0                          |          
| T7	  | L_SHAPE	              | -1                         |         
| T8	  | J_SHAPE	              | 0                          |          

### Functionality-based
#### 3. Model the input domain
- Develop characteristics
  C1 = รูปร่างของ Tetromino (รูปทรงเฉพาะ)
- Partition characteristics

| Characteristic            | b1            | b2          | b3         |
|---------------------------|---------------|-------------|------------|
| C1 = รูปร่างของ Tetromino    | รูปทรงแบบสมมาตร | รูปทรงไม่สมมาตร |รูปร่างไม่ถูกต้อง | 

- Identify possible values

  | Characteristic | b1                 | b2                | b3               |
  |----------------|--------------------|-------------------|------------------|
  | C1             | O_SHAPE (สมมาตร)   | Z_SHAPE (ไม่สมมาตร) | NO_BLOCK (ไม่ถูกต้อง)|

#### 4. Combine partitions into tests
- Assumption: Each Choice
- Test requirements: number of test (upper bound) = 2
  รูปร่าง O_SHAPE, รูปร่าง Z_SHAPE

#### 5. Derive test values

| Test  | Tetromino shape  | Expected result for minX() | Exceptional behavior                                       |
|-------|------------------|----------------------------|------------------------------------------------------------|
| T1    | O_SHAPE          | 0                          | ไม่มี                                                        |
| T2    | Z_SHAPE          | 0                          | หากรูปร่างไม่ถูกต้อง ควรส่งคืนค่าเริ่มต้น เช่น -1 หรือแสดงข้อความแสดงความผิดพลาด|


---
# Test suit 8

### ชื่อ `testRotateLeft`

#### จุดประสงค์: เพื่อตรวจสอบว่าสามารถหมุนรูปร่าง Tetromino ไปทางซ้าย 90 องศาได้ถูกต้อง

#### 1. Identify testable functions: `Tetromino rotateLeft()`
#### 2. Identify parameters, return types, return values, and exceptional behavior
- Parameters: -
- Return type: Tetromino
- Return value:
    - ถ้า tetrominoes มีค่าเป็น O_SHAPE จะคืนค่า this (ออบเจ็กต์ Tetromino ตัวเดิม)
    - ถ้า tetrominoes มีค่าเป็นรูปร่างอื่นๆ จะคืนค่า Tetromino ใหม่ที่ถูกหมุนไปทางซ้าย 90 องศา
- Exceptional behavior: หาก tetrominoes มีค่าเป็น O_SHAPE, ฟังก์ชันจะคืนค่า Tetromino ตัวเดิม
                        หาก tetrominoes มีค่าเป็น NO_BLOCK, ฟังก์ชันจะคืนค่า Tetromino ตัวเดิมเช่นกัน

### Interface-based
#### 3. Model the input domain
- Develop characteristics
    - C1 = tetrominoes เป็น empty block
- Partition characteristics

  | Characteristic             | b1   | b2    |
  |----------------------------|------|-------|
  | **C1** = tetrominoes เป็น empty block | True | False |

- Identify (possible) values

  | Characteristic             | b1   | b2    |
  |----------------------------|------|-------|
  | **C1** = tetrominoes เป็น empty block | NO_BLOCK | I_SHAPE |


#### 4. Combine partitions into tests
- Assumption: Pair-Wise
- Test requirements -- number of tests (upper bound) = 2
  True, False

#### 5. Derive test values
| Test  | tetrominoes | Expected result                           |
|-------|-------------|-------------------------------------------|
| T1    | NO_BLOCK    | คืนค่า NO_BLOCK                           |
| T2    | I_SHAPE     | คืนค่า I_SHAPE ใหม่ที่หมุนทางซ้าย 90 องศา |


### Functionality-based
#### 3. Model the input domain
- Develop characteristics
    - C1 = tetrominoes
- Partition characteristics

  | Characteristic        | b1       | b2      | b3      | b4      | b5      | b6      | b7      | b8      |
  |-----------------------|----------|---------|---------|---------|---------|---------|---------|---------|
  | **C1** = tetrominoes  | NO_BLOCK | Z_SHAPE | S_SHAPE | I_SHAPE | T_SHAPE | O_SHAPE | L_SHAPE | J_SHAPE |

- Identify (possible) values

  | Characteristic        | b1                               | b2                                  | b3                                | b4                                | b5                                | b6                               | b7                                  | b8                                 |
  |-----------------------|----------------------------------|-------------------------------------|-----------------------------------|-----------------------------------|-----------------------------------|----------------------------------|-------------------------------------|------------------------------------|
  | **C1** = tetrominoes  | {{0, 0}, {0, 0}, {0, 0}, {0, 0}} | {{0, -1}, {0, 0}, {-1, 0}, {-1, 1}} | {{0, -1}, {0, 0}, {1, 0}, {1, 1}} | {{0, -1}, {0, 0}, {0, 1}, {0, 2}} | {{-1, 0}, {0, 0}, {1, 0}, {0, 1}} | {{0, 0}, {1, 0}, {0, 1}, {1, 1}} | {{-1, -1}, {0, -1}, {0, 0}, {0, 1}} | {{1, -1}, {0, -1}, {0, 0}, {0, 1}} |

#### 4. Combine partitions into tests
- Assumption: Pair-Wise
- Test requirements -- number of tests (upper bound) = 8

    NO_BLOCK,
    Z_SHAPE,
    S_SHAPE,
    I_SHAPE,
    T_SHAPE,
    O_SHAPE,
    L_SHAPE,
    J_SHAPE



#### 5. Derive test values

| Test  | พิกัดก่อนการหมุน                                  | Expected result (พิกัดหลังการหมุน)            |
|-------|---------------------------------------------------|-----------------------------------------------|
| T1    | {{0, 0}, {0, 0}, {0, 0}, {0, 0}}  **NO_BLOCK**    | {{0, 0}, {0, 0}, {0, 0}, {0, 0}} **พิกัดเดิม** |
| T2    | {{0, -1}, {0, 0}, {-1, 0}, {-1, 1}} **Z_SHAPE**   | {{-1, 0}, {0, 0}, {0, 1}, {1, 1}}             |
| T2    | {{0, -1}, {0, 0}, {1, 0}, {1, 1}}  **S_SHAPE**    | {{-1, 0}, {0, 0}, {0, -1}, {1, -1}}           |
| T2    | {{0, -1}, {0, 0}, {0, 1}, {0, 2}}  **I_SHAPE**    | {{-1, 0}, {0, 0}, {1, 0}, {2, 0}}             |
| T2    | {{-1, 0}, {0, 0}, {1, 0}, {0, 1}}  **T_SHAPE**    | {{0, 1}, {0, 0}, {0, -1}, {1, 0}}             |
| T2    | {{0, 0}, {1, 0}, {0, 1}, {1, 1}}   **O_SHAPE**    | {{0, 0}, {1, 0}, {0, 1}, {1, 1}} **พิกัดเดิม** |
| T2    | {{-1, -1}, {0, -1}, {0, 0}, {0, 1}}   **L_SHAPE** | {{-1, 1}, {-1, 0}, {0, 0}, {1, 0}}            |
| T2    | {{1, -1}, {0, -1}, {0, 0}, {0, 1}}    **J_SHAPE** | {{-1, -1}, {-1, 0}, {0, 0}, {1, 0}}           |

---

# Test suit 9

### ชื่อ `testRotateRight`

#### จุดประสงค์: เพื่อตรวจสอบว่าสามารถหมุนรูปร่าง Tetromino ไปทางขวา 90 องศาได้ถูกต้อง

#### 1. Identify testable functions: `Tetromino rotateRight()`
#### 2. Identify parameters, return types, return values, and exceptional behavior
- Parameters: -
- Return type: Tetromino
- Return value:
    - ถ้า tetrominoes มีค่าเป็น O_SHAPE จะคืนค่า this (ออบเจ็กต์ Tetromino ตัวเดิม)
    - ถ้า tetrominoes มีค่าเป็นรูปร่างอื่นๆ จะคืนค่า Tetromino ใหม่ที่ถูกหมุนไปทางขวา 90 องศา
- Exceptional behavior: หาก coords ของ Tetromino ไม่ได้ถูกกำหนดค่าอาจเกิดข้อผิดพลาด

### Interface-based
#### 3. Model the input domain
- Develop characteristics
    - C1 = tetrominoes เป็น empty block
- Partition characteristics

  | Characteristic             | b1   | b2    |
  |----------------------------|------|-------|
  | **C1** = tetrominoes เป็น empty block | True | False |

- Identify (possible) values

  | Characteristic             | b1   | b2    |
  |----------------------------|------|-------|
  | **C1** = tetrominoes เป็น empty block | NO_BLOCK | I_SHAPE |


#### 4. Combine partitions into tests
- Assumption: Pair-Wise
- Test requirements -- number of tests (upper bound) = 2

  True, False

#### 5. Derive test values
| Test  | tetrominoes | Expected result                          |
|-------|-------------|------------------------------------------|
| T1    | NO_BLOCK    | คืนค่า NO_BLOCK                           |
| T2    | I_SHAPE     | คืนค่า I_SHAPE ใหม่ที่หมุนทางขวา 90 องศา |


### Functionality-based
#### 3. Model the input domain
- Develop characteristics
    - C1 = tetrominoes
- Partition characteristics

  | Characteristic        | b1 | b2 | b3 | b4 | b5 | b6 |b7 | b8 |
  |-----------------------|-----|-----|-----|-----|-----|-----|-----|-----|
  | **C1** = tetrominoes  | NO_BLOCK | Z_SHAPE | S_SHAPE | I_SHAPE | T_SHAPE | O_SHAPE | L_SHAPE | J_SHAPE |

- Identify (possible) values

  | Characteristic        | b1 | b2 | b3 | b4 | b5 | b6 |b7 | b8 |
  |-----------------------|-----|-----|-----|-----|-----|-----|-----|-----|
  | **C1** = tetrominoes  | {{0, 0}, {0, 0}, {0, 0}, {0, 0}} | {{0, -1}, {0, 0}, {-1, 0}, {-1, 1}} | {{0, -1}, {0, 0}, {1, 0}, {1, 1}} | {{0, -1}, {0, 0}, {0, 1}, {0, 2}} | {{-1, 0}, {0, 0}, {1, 0}, {0, 1}} | {{0, 0}, {1, 0}, {0, 1}, {1, 1}} | {{-1, -1}, {0, -1}, {0, 0}, {0, 1}} | {{1, -1}, {0, -1}, {0, 0}, {0, 1}} |

#### 4. Combine partitions into tests
- Assumption: Pair-Wise
- Test requirements -- number of tests (upper bound) = 8

    NO_BLOCK,
    Z_SHAPE,
    S_SHAPE,
    I_SHAPE,
    T_SHAPE,
    O_SHAPE,
    L_SHAPE,
    J_SHAPE


#### 5. Derive test values

| Test  | พิกัดก่อนการหมุน                                  | Expected result (พิกัดหลังการหมุน)             |
|-------|---------------------------------------------------|------------------------------------------------|
| T1    | {{0, 0}, {0, 0}, {0, 0}, {0, 0}}  **NO_BLOCK**    | {{0, 0}, {0, 0}, {0, 0}, {0, 0}} **พิกัดเดิม** |
| T2    | {{0, -1}, {0, 0}, {-1, 0}, {-1, 1}} **Z_SHAPE**   | {{1, 0}, {0, 0}, {0, -1}, {-1, -1}}            |
| T2    | {{0, -1}, {0, 0}, {1, 0}, {1, 1}}  **S_SHAPE**    | {{1, 0}, {0, 0}, {0, 1}, {-1, 1}}              |
| T2    | {{0, -1}, {0, 0}, {0, 1}, {0, 2}}  **I_SHAPE**    | {{1, 0}, {0, 0}, {-1, 0}, {-2, 0}}             |
| T2    | {{-1, 0}, {0, 0}, {1, 0}, {0, 1}}  **T_SHAPE**    | {{0, -1}, {0, 0}, {0, 1}, {-1, 0}}             |
| T2    | {{0, 0}, {1, 0}, {0, 1}, {1, 1}}   **O_SHAPE**    | {{0, 0}, {1, 0}, {0, 1}, {1, 1}} **พิกัดเดิม** |
| T2    | {{-1, -1}, {0, -1}, {0, 0}, {0, 1}}   **L_SHAPE** | {{1, -1}, {1, 0}, {0, 0}, {-1, 0}}             |
| T2    | {{1, -1}, {0, -1}, {0, 0}, {0, 1}}    **J_SHAPE** | {{1, 1}, {1, 0}, {0, 0}, {-1, 0}}              |

---

# Test suit 10

### ชื่อ `testAtomIsMovable`

#### จุดประสงค์: เพื่อตรวจสอบว่า chkBlock สามารถเคลื่อนไปยังตำแหน่ง (chkX, chkY) ได้หรือไม่

#### 1. Identify testable functions: `private boolean invokeAtomIsMovable(Tetromino chkBlock, int chkX, int chkY, boolean flag) throws Exception`
#### 2. Identify parameters, return types, return values, and exceptional behavior
- Parameters: Tetromino chkBlock, int chkX, int chkY, boolean flag
- Return type: boolean
- Return value: true, false
- Exceptional behavior: 
   - Invalid Tetromino: หาก chkBlock ไม่เป็น Tetromino ที่ถูกต้อง เช่น null หรือค่าที่ไม่ใช่ค่าใน enum Tetrominoes (เช่น Tetromino.invalid), ฟังก์ชันควรจะทำการ throw Exception ขึ้นมา (หรือคืนค่า false)
   - Out of Bounds: ถ้า chkX หรือ chkY ออกนอกขอบเขตของบอร์ด (เช่น น้อยกว่า 0 หรือมากกว่าขนาดของบอร์ด), ฟังก์ชันควรจะคืนค่า false
   - Invalid Flag Value: หาก flag มีค่าไม่ใช่ true หรือ false (เช่น null หรือค่าอื่น), ฟังก์ชันควรจะ throw Exception 
   - Unexpected Exception: ฟังก์ชันอาจ throw Exception อื่นๆ ที่ไม่คาดคิดในระหว่างการประมวลผล เช่นปัญหาจากการเข้าถึงข้อมูลที่จำเป็น (เช่น การเข้าถึงบล็อคในตำแหน่งที่ไม่ถูกต้อง)
   - State Conflict: หากสถานะของ chkBlock อยู่ในระหว่างการเคลื่อนที่หรือมีการเปลี่ยนแปลงที่ไม่สามารถทำได้ในขณะนั้น (เช่น มีการหมุนในขณะเดียวกัน), ฟังก์ชันควรจะ return false หรือ throw Exception

### Interface-based
#### 3. Model the input domain
- Develop characteristics
    - C1 = tetrominoes
    - C2 = ค่า chkX (ตำแหน่ง x ที่ต้องการตรวจสอบความสามารถในการเคลื่อนที่)
    - C3 = ค่า chkY (ตำแหน่ง y ที่ต้องการตรวจสอบความสามารถในการเคลื่อนที่)
    - C4 = ค่า flag ซึ่งบ่งบอกว่าควรอัปเดตตำแหน่งของ curBlock บนบอร์ดเมื่อสามารถเคลื่อนที่ได้
- Partition characteristics

|Characteristic| b1 | b2 | b3 | b4 | b5 | b6 |b7 | b8 |
|----- |-----|-----|-----|-----|-----|-----|-----|-----|
| **C1** = tetrominoes | NO_BLOCK | Z_SHAPE | S_SHAPE | I_SHAPE | T_SHAPE | O_SHAPE | L_SHAPE | J_SHAPE |
| **C2** = ค่า chkX | <0   | 0     | \>0 |
| **C3** = ค่า chkY | <0   | 0     | \>0 |
| **C4** = ค่า flag | True | False |

- Identify (possible) values

  |Characteristic| b1 | b2 | b3 | b4 | b5 | b6 |b7 | b8 |
  |----- |-----|-----|-----|-----|-----|-----|-----|-----|
  | **C1** = tetrominoes | NO_BLOCK | Z_SHAPE | S_SHAPE | I_SHAPE | T_SHAPE | O_SHAPE | L_SHAPE | J_SHAPE |
  | **C2** = ค่า chkX | -1       | 0       | 1 |
  | **C3** = ค่า chkY | -1       | 0       | 1 |
  | **C4** = ค่า flag | True     | False   |

#### 4. Combine partitions into tests
- Assumption: Each Choice
- Test requirements -- number of tests (upper bound) = 8

  (NO_BLOCK, -1, -1, True), (Z_SHAPE, 0, 0, False), (S_SHAPE, 1, 1, False), (I_SHAPE, -1, 0, True),
  (T_SHAPE, 0, -1, True), (O_SHAPE, 0, 1, True), (L_SHAPE, 1, 0, False), (J_SHAPE, 1, 1, True)


#### 5. Derive test values

| Test | chkBlock  | chkX | chkY | flag  | Expected result   |
|------|-----------|------|------|-------|-------------------|
| T1   | NO_BLOCK  | -1   | -1   | True  | false             |
| T2   | Z_SHAPE   | 0    | 0    | False | true              |
| T3   | S_SHAPE   | 1    | 1    | False | true              |
| T4   | I_SHAPE   | -1   | 0    | True  | false             |
| T5   | T_SHAPE   | 0    | -1   | True  | false             |
| T6   | O_SHAPE   | 0    | 1    | True  | true              |
| T7   | L_SHAPE   | 1    | 0    | False | true              |
| T7   | J_SHAPE   | 1    | 1    | True  | true              |

### Functionality-based
#### 3. Model the input domain
- Develop characteristics

    - C1 = มีบล็อคอื่นอยู่ในตำแหน่ง (chkX, chkY)
- Partition characteristics

  | Characteristic          | b1   | b2    |
  |-------------------------|------|-------|
  | **C1** = มีบล็อคอื่นอยู่ในตำแหน่ง (chkX, chkY)  | True | False |

- Identify (possible) values

  | Characteristic | b1                           | b2                         |
  |------------|------------------------------|----------------------------|
  | **C1** = มีบล็อคอื่นอยู่ในตำแหน่ง (chkX, chkY)  | มีบล็อค I_SHAPE อยู่ใน (5,5) | ไม่มีบล็อคอื่นอยู่ใน (5,5) |

#### 4. Combine partitions into tests
- Assumption: Each Choice
- Test requirements -- number of tests (upper bound) =  2

  True, False

#### 5. Derive test values

| Test | มีบล็อคอื่นอยู่ใน (5,5)   | Expected result   |
|------|---------------------|-------------------|
| T1   | True                | False             |
| T2   | False               | True              |
