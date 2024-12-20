class MonkeyBananaProblem:
    def __init__(self):
        self.monkey_position = 'floor'
        self.box_position = 'floor'
        self.has_banana = False

    def solve(self):
        # Move box under bananas
        self.box_position = 'under bananas'
        print("Monkey moves box under bananas.")

        # Climb on box
        self.monkey_position = 'box'
        print("Monkey climbs on box.")

        # Take bananas
        self.has_banana = True
        print("Monkey takes bananas!")

if __name__ == "__main__":
    problem = MonkeyBananaProblem()
    problem.solve()