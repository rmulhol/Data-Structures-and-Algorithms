(define (ex1.1) 
  (define (display-each-arg args) 
    (cond ((null? args) 0)
      (else
        (display (car args))
        (newline)
        (newline)
        (display-each-arg (cdr args))
      )
    )
  )

  (define a 3)
  (define b (+ a 1))

  (display-each-arg 
    (list 
      (string "1) 10 equals " 10)
      (string "2) (+ 5 3 4) equals " (+ 5 3 4))
      (string "3) (- 9 1) equals " (- 9 1))
      (string "4) (/ 6 2) equals " (/ 6 2))
      (string "5) (+ (* 2 4) (- 4 6)) equals " (+ (* 2 4) (- 4 6)))
      (string "6) (define a 3) associates the value of 3 with the name a")
      (string "7) (define b (+ a 1)) associates the value of a + 1 with the name b")
      (string "8) (+ a b (* a b)) adds the sum of a and b to the product of a and b: " (+ a b (* a b)))
      (string "9) (= a b) returns a boolean indicating whether a equals b: #f")
      (string "10) The expression: 
      (if (and (> b a) (< b (* a b)))
          b
          a) 
      evaluates the predicate (and (> b a) (< b (* a b))), returning the consequent b if true or the alternative a if false: " 
      (if (and (> b a) (< b (* a b))) 
          b 
          a))
      (string "11) The expression: 
      (cond ((= a 4) 6)
            ((= b 4) (+ 6 7 a))
            (else 25))
      evaluates the clauses in order, returning the consequent expression corresponding to the first predicate that evaluates to true: " 
      (cond ((= a 4) 6)
            ((= b 4) (+ 6 7 a))
            (else 23)))
      (string "12) The expression (+ 2 (if (> b a) b a)) returns the sum of 2 plus the value returned by the `if` expression: " (+ 2 (if (> b a) b a)))
      (string "13) The expression: 
      (* (cond ((> a b) a)
               ((< a b) b)
               (else -1))
         (+ a 1)) 
      returns the product of the value returned by the conditional expression times the sum of a and 1: " 
      (* (cond ((> a b) a)
              ((< a b) b)
              (else -1))
         (+ a 1)))
    )
  )
)