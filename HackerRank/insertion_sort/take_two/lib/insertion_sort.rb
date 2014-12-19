class InsertionSort
  def insertion_sort(array)
    1.upto(array.length-1) do |num|
      if cell_must_be_sorted?(num, array)
        index_to_insert = value_fits_at(array[num], array)
        array.insert(index_to_insert, array[num]).uniq!
        print_array(array)
      else
        print_array(array)
      end
    end
  end
  
  def cell_must_be_sorted?(cell, array)
    if cell == 0
      array[cell] > array[cell + 1]
    elsif cell == array.length - 1
      array[cell] < array[cell - 1]
    else
      array[cell] < array[cell - 1] || array[cell] > array[cell + 1]
    end
  end

  def value_fits_at(value, array)
    array.each_with_index do |val, idx|
      if idx == 0
        if value < val
          return 0
        end
      elsif idx == array.length - 1
        if value > val
          return idx + 1
        elsif value < val
          return idx
        end
      else
        if value > array[idx - 1] && value < array[idx]
          return idx
        end
      end
    end
  end

  def print_array(array)
    array.each do |emt|
      print "#{emt} "
    end
    puts ""
  end
end
