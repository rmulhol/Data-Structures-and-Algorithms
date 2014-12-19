require "insertion_sort"

describe InsertionSort do
  let(:test) { described_class.new }

  describe "#insertion_sort" do
    it "outputs every step of running insertion sort on an array of 3 elements" do
      expect{ test.insertion_sort([1,3,2]) }.to output("1 3 2 \n1 2 3 \n").to_stdout
    end

    it "outputs every step of running insertion sort on an array of 6 elements" do
      expected_output = "1 4 3 5 6 2 \n1 3 4 5 6 2 \n1 3 4 5 6 2 \n1 3 4 5 6 2 \n1 2 3 4 5 6 \n"
      expect{ test.insertion_sort([1,4,3,5,6,2]) }.to output(expected_output).to_stdout
    end
  end
  
  describe "#cell_must_be_sorted?" do
    it "returns true if middle cell is unsorted" do
      expect(test.cell_must_be_sorted?(1, [1,3,2])).to be_truthy
    end

    it "returns false if middle cell is already sorted" do
      expect(test.cell_must_be_sorted?(1, [1,2,3])).to be_falsey
    end

    it "returns true if first cell is unsorted" do
      expect(test.cell_must_be_sorted?(0, [3,1,2])).to be_truthy
    end

    it "returns false if first cell is already sorted" do
      expect(test.cell_must_be_sorted?(0, [1,3,2])).to be_falsey
    end

    it "returns true if last cell is unsorted" do
      expect(test.cell_must_be_sorted?(2, [2,3,1])).to be_truthy
    end

    it "returns false if last cell is already sorted" do
      expect(test.cell_must_be_sorted?(2, [2, 1, 3])).to be_falsey
    end
  end

  describe "#value_fits_at" do
    it "returns index 0 when value 1 should be inserted there" do
      expect(test.value_fits_at(1, [2,3])).to eq(0)
    end
    
    it "returns index 1 when value 2 should be inserted there" do
      expect(test.value_fits_at(2, [1,3])).to eq(1)
    end

    it "returns index 2 when 3 should be inserted there" do
      expect(test.value_fits_at(3, [1,2,4])).to eq(2)
    end

    it "returns index 3 when 4 should be inserted there" do
      expect(test.value_fits_at(4, [1,2,3])).to eq(3)
    end
  end

  describe "#print_array" do
    it "prints the elements in an array to STDOUT without separators" do
      expect{ test.print_array([1,2,3]) }.to output("1 2 3 \n").to_stdout
    end
  end
end
