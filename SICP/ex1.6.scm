(define (ex1.6) (display
  (string "If one wanted to define the `if` special form as an ordinary procedure, one way to do so would be to implement it as follows:

    (define (new-if predicate then-clause else-clause) 
      (cond (predicate then-clause)
            (else else-clause)))

  You might then use this `new-if` to implement a procedure to compute the square root of an integer like so:

    (define (sqrt-iter guess x)
      (new-if (good-enough? guess x)
              guess
              (square-iter (improve guess x) x)))

  Unfortunately, however, this implementation of the square root procedure would fail to return an answer. While the special form `if` ceases evaluation if the predicate evaluates to true, new-if is an ordinary procedure that uses applicative-order evaluation. Hence, it would ceaselessly evaluate the recursive call at the end of the sqrt-iter procedure."))
  0
)