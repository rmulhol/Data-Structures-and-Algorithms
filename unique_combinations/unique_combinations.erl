-module(unique_combinations).
-include_lib("eunit/include/eunit.hrl").
-compile(export_all).

maximum_number_of_unique_combinations_between_one_and(Num) ->
  maximum_number_of_unique_combinations_between_one_and(Num, 0).

maximum_number_of_unique_combinations_between_one_and(0, Acc) -> Acc;
maximum_number_of_unique_combinations_between_one_and(Num, Acc) ->
  maximum_number_of_unique_combinations_between_one_and(Num - 1, Acc + Num - 1).

maximum_number_of_unique_combinations_between_one_and_test() ->
  10 = maximum_number_of_unique_combinations_between_one_and(5),
  10 = maximum_number_of_unique_combinations_between_one_and(0, 10),
  10 = maximum_number_of_unique_combinations_between_one_and(5, 0).
