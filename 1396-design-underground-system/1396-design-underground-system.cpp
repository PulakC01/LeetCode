class UndergroundSystem {
public:
    unordered_map<int,pair<string,int>> check_in; // {{id -> {stationName,time}}
    map<pair<string,string>,vector<int>> time_avg; // {{startStation,endStation} -> time[]}
    
    UndergroundSystem() {
        
    }
    
    
    void checkIn(int id, string stationName, int t) {
        check_in[id]={stationName,t};
    }
    
    void checkOut(int id, string stationName, int t) {
        int timeTaken = t - check_in[id].second;
        string checkInStation = check_in[id].first;
        time_avg[{checkInStation,stationName}].push_back(timeTaken);
    }
    
    double getAverageTime(string startStation, string endStation) {
        double ans = 0;
        int total = 0;
        for(auto &i : time_avg[{startStation,endStation}]) {
            ans += i;
            total++;
        }
        return ans/(double)total;
    }
};

/**
 * Your UndergroundSystem object will be instantiated and called as such:
 * UndergroundSystem* obj = new UndergroundSystem();
 * obj->checkIn(id,stationName,t);
 * obj->checkOut(id,stationName,t);
 * double param_3 = obj->getAverageTime(startStation,endStation);
 */