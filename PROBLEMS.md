# Programming Challenge: Problems

Write each method below in `src/main/java/Solution.java`. Every method
**returns** its answer - do not print anything and do not read input with a
`Scanner`. The official tests call your methods directly and check what they
return.

**You can use `if` statements in any of these methods.** BUT every problem can be
solved with arithmetic, casting, and Java's built-in methods.
`if(){}else{}`

Run `mvn clean test` at any time to see which tests pass.

---

## Problem 1: Test Average Calculator

A student has taken 4 tests. Scores can be whole numbers or decimals
(e.g. `75`, `80.5`, `82.75`, `90.0`).

### `public double average(double t1, double t2, double t3, double t4)`

Return the actual average of the four test scores.

| Call | Returns |
|---|---|
| `average(75, 80.5, 82.75, 90.0)` | `82.0625` |
| `average(88, 92, 85, 95)` | `90.0` |

### `public int roundAverage(double average)`

Return the average rounded to the nearest whole number.

| Call | Returns |
|---|---|
| `roundAverage(82.0625)` | `82` |
| `roundAverage(89.7)` | `90` |
| `roundAverage(64.5)` | `65` |

### `public boolean isPassing(int roundedAverage)`

Return `true` if the rounded average is passing (greater than or equal to
65) and `false` if it is not.

| Call | Returns |
|---|---|
| `isPassing(82)` | `true` |
| `isPassing(65)` | `true` |
| `isPassing(64)` | `false` |

Hint: `>=` already produces a `true`/`false` value.

---

## Problem 2: Stock Value Change

You own some shares of a stock. Each day the stock's price changes by some
amount, which can be positive (the price went up) or negative (the price
went down).

### `public double valueChange(int shares, double change)`

Return how much the total value of your shares changed.

| Call | Returns |
|---|---|
| `valueChange(100, 1.25)` | `125.0` |
| `valueChange(40, -0.37)` | `-14.8` |

### `public int roundValueChange(double valueChange)`

Return the change in value rounded to the nearest whole dollar. This must
work for **both positive and negative** values.
**Try Math.round()**

| Call | Returns |
|---|---|
| `roundValueChange(25.6)` | `26` |
| `roundValueChange(-14.2)` | `-14` |
| `roundValueChange(-14.8)` | `-15` |

Hint: check your rounding with a negative number. A trick that works for
positive numbers might not work for negative ones.

---

## Problem 3: Adjusted Digits

### `public Double adjustDigits(double userDouble)`

`userDouble` is a number between `100.00` and `999.99` with up to 2
decimal places. Add 1 to each of its five digits - a `9` wraps around to
`0` - and return the result as a `Double` in the form `ddd.dd`.

| Call | Returns |
|---|---|
| `adjustDigits(123.45)` | `234.56` |
| `adjustDigits(999.99)` | `000.00` |
| `adjustDigits(109.90)` | `210.01` |

Hints:
- `%` and `/` can pull individual digits out of a whole number. Experiment with `%` and groups of `10` . What does `1234%10` give you? What about `1234%100`? You want to extract the digits and then add them back together for the final result. 

