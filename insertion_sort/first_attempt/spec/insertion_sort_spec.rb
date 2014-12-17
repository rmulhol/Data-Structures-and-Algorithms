require "insertion_sort"

describe InsertionSort do
  let(:test) { described_class.new }

  describe "#insertion_sort" do
    it "outputs each step until sorting is complete" do
      expect { test.insertion_sort([1,4,2,5,6,3]) }.to output("[1, 2, 4, 5, 6, 3]\n[1, 2, 3, 4, 5, 6]\n").to_stdout
    end
  end

  describe "#find_unsorted_value" do
    it "locates 2 as the first value that is unsorted" do
      expect(test.find_unsorted_value([1,4,2,5,6,3])).to eq(2)
    end
    
    it "locates 3 as the first value that is unsorted" do
      expect(test.find_unsorted_value([1,4,3,5,6,2])).to eq(3)
    end
  end

  describe "#remove_unsorted_value" do
    it "returns an array without 2 when 2 is first unsorted value" do
      expect(test.remove_unsorted_value([1,4,2,5,6,3])).to eq([1,4,5,6,3])
    end

    it "returns an array without 2 when 2 is the first unsorted value in a different position" do
      expect(test.remove_unsorted_value([1,5,6,2,3,4])).to eq([1,5,6,3,4])
    end
  end

  describe "#find_index_for_where_to_insert_unsorted_value" do
    it "locates index 1 as the proper place to store 2" do
      expect(test.find_index_for_where_to_insert_unsorted_value([1,4,2,5,6,3])).to eq(1)
    end

    it "locates index 2 as the proper place to store 3" do
      expect(test.find_index_for_where_to_insert_unsorted_value([1,2,4,3,6,5])).to eq(2)
    end
  end

  describe "#insert_unsorted_value" do
    it "sorts 2 to index 1" do
      expect(test.insert_unsorted_value([1,4,2,5,6,3])).to eq([1,2,4,5,6,3])
    end

    it "sorts 3 to index 2" do
      expect(test.insert_unsorted_value([1,2,4,5,6,3])).to eq([1,2,3,4,5,6])
    end
  end

  describe "#array_is_sorted?" do
    it "returns true if an array is sorted" do
      expect(test.array_is_sorted?([1,2,3,4,5,6])).to be_truthy
    end

    it "returns false if an array is unsorted" do
      expect(test.array_is_sorted?([1,4,5,6,2,3])).to be_falsey
    end
  end
end
