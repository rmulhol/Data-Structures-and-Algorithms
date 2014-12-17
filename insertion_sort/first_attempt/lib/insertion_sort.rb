class InsertionSort

  def insertion_sort(array)
    until array_is_sorted?(array)
      array = insert_unsorted_value(array)
      puts array.inspect
    end
  end


  def find_unsorted_value(array)
    array.each_with_index do |val, idx|
      unless idx == 0
        if val < array[idx - 1]
          return val
        end
      end
    end
  end

  def remove_unsorted_value(array)
    first_unsorted_value = find_unsorted_value(array)
    array - [first_unsorted_value]
  end

  def find_index_for_where_to_insert_unsorted_value(array)
    first_unsorted_value = find_unsorted_value(array)
    more_sorted_array = remove_unsorted_value(array)
    more_sorted_array.each_with_index do |val, idx|
      if val < first_unsorted_value && first_unsorted_value < more_sorted_array[idx+1]
        return idx + 1
      end
    end
  end

  def insert_unsorted_value(array)
    first_unsorted_value = find_unsorted_value(array)
    index_to_insert = find_index_for_where_to_insert_unsorted_value(array)
    more_sorted_array = remove_unsorted_value(array)
    more_sorted_array.insert(index_to_insert, first_unsorted_value)
  end

  def array_is_sorted?(array)
    array_is_sorted = true
    array.each_with_index do |val,idx|
      if idx == 0
        unless val < array[idx + 1]
          array_is_sorted = false
        end
      else
        unless val > array[idx - 1]
          array_is_sorted = false
        end
      end
    end
    array_is_sorted
  end
end
