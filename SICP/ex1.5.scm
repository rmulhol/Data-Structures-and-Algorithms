(define (ex1.5) 
  (display
    (string "If one defines the following two procedures: 

      (define (p) (p))
      (define (test x y)
        (if (= x 0) 0 y)
      )

      then evaluating the expression (test 0 (p)) will yield different behavior depending on whether the interpreter uses applicative-order or normal-order evaluation.

      Using applicative-order evaluation, the expression will never terminate. As the expression attempts to evaluate the argument (p), it encounters an infinite loop.

      Using normal-order evaluation, the expression returns 0, since (= x 0) evaluates to true (any the argument (p) never needs to get evaluated).
    ")
  )
  0
)