# GetLoopy — Lab 7: Get Loopy

IT 1090C Computer Programming I — Java looping practice.

## Files
| File | What it does |
|------|--------------|
| `src/GetLoopy.java` | Tasks 1–7: counting `for` loops and nested `for` loop figures |
| `src/DieRollar.java` | Task 8: rolls 3 dice until a triple, shows a `printf` table, offers to play again |
| `GetLoopy_output.txt` | Sample output of Tasks 1–7 |
| `DieRollar_output.txt` | Sample output of Task 8 (three games) |

## Part A — Counting loops
- **Task 1:** count up by 1 from 0 to 30 — `for (int i = 0; i <= 30; i++)`
- **Task 2:** count down by 1 from 30 to 0 — `for (int i = 30; i >= 0; i--)`
- **Task 3:** count up by 3 from 0 to 18 — `for (int i = 0; i <= 18; i += 3)`
- **Task 4:** count down by 2 from 10 to 0 — `for (int i = 10; i >= 0; i -= 2)`

## Part B — Nested loops
- **Task 5:** triangle growing from 1 to 5 stars
- **Task 6:** triangle shrinking from 5 to 1 star
- **Task 7:** 5 × 5 square of stars

## Part C — Die Roller (Task 8)
Uses `java.util.Random` to throw three dice (1–6) until all three match, printing each
throw's number, die values and sum in a table, then asks `Roll again? [Y/N]`.

## Run it
```
javac -d out src/*.java
java -cp out GetLoopy
java -cp out DieRollar
```
