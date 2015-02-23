(define (ex1.4) 
  (display 
    (string "The procedure: 
      
      (define (a-plus-abs-b a b)
        ((if (> b 0) + -) a b))

      derives the value of `a` plus the absolute value of `b` by using a compound expression to derive the operator necessary to sum `a` with the absolute value of `b`.
      If `b` is greater than 0, then the if expression returns the `+` operator. a-plus-abs-b then evaluates to (+ a b).
      If `b` is less than or equal to 0, then the `if` expression returns the `-` operator. a-plus-abs-b then evaluates to (- a b).")
  )
  0
)