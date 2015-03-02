(define (inc a)
  (+ a 1))

(define (dec a)
  (- a 1))

(define (new-plus-1 a b) 
  (if (= a 0)
      b
      (inc (new-plus-1 (dec a) b))))

(define (new-plus-2 a b)
  (if (= a 0)
      b
      (new-plus-2 (dec a) (inc b))))

(define (explain) 
  (display (string "This exercise asks us to compare whether the processes implied by two addition procedures are iterative or recursive.

    (define (new-plus-1 a b) 
      (if (= a 0)
          b
          (inc (new-plus-1 (dec a) b))))

    (define (new-plus-2 a b)
      (if (= a 0)
          b
          (new-plus-2 (dec a) (inc b))))

    Evaluating (new-plus-1 4 5) proceeds as follows:
      (new-plus-1 4 5)
      (inc (new-plus-1 (dec 4) 5))
      (inc (new-plus-1 3 5))
      (inc (inc (new-plus-1 (dec 3) 5)))
      (inc (inc (new-plus-1 2 5)))
      (inc (inc (inc (new-plus-1 (dec 2) 5))))
      (inc (inc (inc (new-plus-1 1 5))))
      (inc (inc (inc (inc (new-plus-1 (dec 1) 5)))))
      (inc (inc (inc (inc (new-plus-1 0 5)))))
      (inc (inc (inc (inc 5))))
      (inc (inc (inc 6)))
      (inc (inc 7))
      (inc 8)
      9
            
    Evaluating (new-plus-2 4 5) proceeds as follows:
      (new-plus-2 4 5)
      (new-plus-2 (dec 4) (inc 5))
      (new-plus-2 3 6)
      (new-plus-2 (dec 3) (inc 6))
      (new-plus-2 2 7)
      (new-plus-2 (dec 2) (inc 7))
      (new-plus-2 1 8)
      (new-plus-2 (dec 1) (inc 8))
      (new-plus-2 0 9)
      9

    Since evaluating new-plus-1 builds a chain of deferred (increment) operations, it is a (linear) recursive process. Such a process 'reuires that the interpreter keep track of the operations to be performed later on' (44, SICP).
    On the other hand, new-plus-2 is an iterative process; in its evaluation, 'the program variables provide a complete description of the state of the process at any point' (45, SICP).

    Note that while the types of the two processes differ, both procedures are recursive (given, for each case, 'the syntactic fact that the procedure definition refers (either directly or indirectly) to the procedure itself' (45, SICP))."))
  0
)