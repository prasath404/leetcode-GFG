from collections import Counter

class Solution(object):
    def topKFrequent(self, nums, k):
        freq = Counter(nums)
        return [num for num, _ in freq.most_common(k)]
