class Solution(object):
    def reverseWords(self, s):
        """
        :type s: str
        :rtype: str
        """
        words=s.split()
        reversed_words=words[::-1]
        return ' '.join(reversed_words)