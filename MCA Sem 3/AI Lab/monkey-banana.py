class MonkeyBananaProblem:
    def __init__(self):
        self.monkey_position = 'floor'
        self.box_position = 'floor'
        self.banana_position = 'box'  # Bananas are initially at the box
        self.has_banana = False  # whether the monkey has the bananas

    def move_box(self):
        if self.box_position == 'floor':
            print("Monkey moves the box under the bananas.")
            self.box_position = 'under bananas'

    def climb_box(self):
        if self.box_position == 'under bananas' and self.monkey_position == 'floor':
            print("Monkey climbs onto the box.")
            self.monkey_position = 'box'
        elif self.box_position != 'under bananas':
            print("Monkey can't climb the box because it is not under the bananas.")

    def take_bananas(self):
        if self.monkey_position == 'box' and self.banana_position == 'box':
            print("Monkey takes the bananas.")
            self.has_banana = True
            self.banana_position = 'with monkey'  # Bananas are now with the monkey

    def solve(self):
        print("Starting the Monkey and Banana Problem...")
        self.move_box()        # step 1: move the box under the bananas
        self.climb_box()       # step 2: climb on the box
        self.take_bananas()    # step 3: take the bananas
        if self.has_banana:
            print("Monkey has successfully retrieved the bananas!")

if __name__ == "__main__":
    problem = MonkeyBananaProblem()
    problem.solve()
