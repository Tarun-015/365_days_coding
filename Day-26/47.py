# Find final position in 2d given initial position and velocity
# Given an initial position of a point moving in a 2d cartesian plane with a constant velocity, find the the final position of the point after a given time in two dimensions.

# Hint: final position = intial position + velocity * time


def final_position(pos: tuple, vel: tuple, time:int) -> tuple:
    '''
    Given an initial position of a point moving in a cartesian plane with a constant velocity, 
    find the the final position of the point after a given time. 
    
    Hint: final position = intial position + velocity * time

    Args:
        pos - tuple[int]: A tuple representing the position vector (x1, y1).
        vel - tuple[int]: A tuple representing the velocity vector (vx, vy).
        time - int: time of movement.

    Returns:
        tuple[int]: A tuple representing the displacement (dx, dy).
    '''
    
    
    x1, y1 = pos
    vx, vy = vel
    return (x1+vx*time , y1+vy*time)
    
