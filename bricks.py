def make_chocolate(small, big, goal): 
  bigBar = 5 * big
  remaining = 0
  bigBarsReq = goal // 5
  smallBarsReq = goal % 5 
  if (bigBarsReq <= big):remaining = goal - (bigBarsReq *  5)
  else:remaining = goal - bigBar
  if (remaining <= small):return remaining
  else:return -1 
    