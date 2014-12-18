-module(unique_combinations_with_io).
-export([main/0]).

main() ->
    FirstNumToDiscard = string:to_integer(io:get_line([])), 
    print_output().

maximum_unique_combinations(Num) ->
    maximum_unique_combinations(Num, 0).

maximum_unique_combinations(0, Acc) -> Acc;
maximum_unique_combinations(Num, Acc) ->
    maximum_unique_combinations(Num - 1, Acc + Num - 1).

print_output() ->
    print_output(io:get_line([])).

print_output(eof) ->
    halt();

print_output(Data) ->
    { Num, _ } = string:to_integer(Data),
    Combos = maximum_unique_combinations(Num),
    io:format("~p~n", [Combos]),
    print_output().
