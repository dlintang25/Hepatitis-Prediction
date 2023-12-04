public class prosesPeluang implements proses{  //Inheritance
    private double peluangHidup;    //encapsulasi dengan hak akses private agar hanya dapat diakses kelas itu sendiri
    private double peluangMati;     //encapsulasi dengan hak akses private agar hanya dapat diakses kelas itu sendiri


    ///dataaa
    private double mnnnnd, mnnnnl, mnnnnt, 
            mnnntd, mnnntl, mnnntt,
            mnntnd, mnntnl, mnntnt,
            mnnttd, mnnttl, mnnttt,
            mntnnd, mntnnl, mntnnt,
            mntntd, mntntl, mntntt,
            mnttnd, mnttnl, mnttnt,
            mntttd, mntttl, mntttt,
            mtnnnd, mtnnnl, mtnnnt,
            mtnntd, mtnntl, mtnntt,
            mtntnd, mtntnl, mtntnt, 
            mtnttd, mtnttl, mtnttt,
            mttnnd, mttnnl, mttnnt,
            mttntd, mttntl, mttntt,
            mtttnd, mtttnl, mtttnt,
            mttttd, mttttl, mttttt,
            tnnnnd, tnnnnl, tnnnnt,
            tnnntd, tnnntl, tnnntt,
            tnntnd, tnntnl, tnntnt,
            tnnttd, tnnttl, tnnttt,
            tntnnd, tntnnl, tntnnt,
            tntntd, tntntl, tntntt, 
            tnttnd, tnttnl, tnttnt,
            tntttd, tntttl, tntttt,
            ttnnnd, ttnnnl, ttnnnt,
            ttnntd, ttnntl, ttnntt,
            ttntnd, ttntnl, ttntnt,
            ttnttd, ttnttl, ttnttt,
            tttnnd, tttnnl, tttnnt,
            tttntd, tttntl, tttntt,
            ttttnd, ttttnl, ttttnt,
            tttttd, tttttl, tttttt,
            totalHidup, totalMati, 
            pembagi, jumlahTotal,
            pembagiKuning, pembagiBiru, 
            pembagiMerah;
             
             
double [][]dataMentah={
                        {2, 28, 1.6, 44, 123, 4},
                        {1, 44, 0.9, 135, 55, 3.81},
                        {1, 30, 2.5, 165, 64, 2.8},
                        {1, 38, 1.2, 118, 16, 2.8},
                        {2, 38, 0.6, 76, 18, 4.4},
                        {2, 50, 0.9, 230, 117, 3.4},
                        {1, 42, 4.6, 105, 55, 3.3},
                        {2, 52, 1.5, 105, 69, 2.9},
                        {1, 59, 1.5, 107, 157, 3.6},
                        {2, 40, 0.6, 40, 69, 4.2},
                        {2, 30, 0.8, 147, 128, 3.9},
                        {2, 44, 3, 114, 65, 3.5},
                        {1, 47, 2, 84, 23, 4.2},
                        {2, 60, 1.42, 105, 40, 3.81},
                        {1, 48, 4.8, 123, 157, 2.7},
                        {2, 22, 0.7, 105, 24, 3.81},
                        {2, 27, 2.4, 168, 227, 3},
                        {2, 51, 4.6, 215, 269, 3.9},
                        {1, 47, 1.7, 86, 20, 2.1},
                        {2, 25, 0.6, 105, 34, 6.4},
                        {2, 45, 2.3, 105, 648, 3.81},
                        {2, 54, 1, 155, 225, 3.6},
                        {1, 33, 0.7, 63, 80, 3},
                        {2, 7, 0.7, 256, 25, 4.2},
                        {1, 42, 0.5, 62, 68, 3.8},
                        {2, 52, 1, 85, 30, 4},
                        {2, 45, 1.2, 81, 65, 3},
                        {2,36,1.1,141,75,3.3},
                        {2, 69, 3.2, 119, 136, 3.81},
                        {2, 24, 1, 105, 34, 4.1},
                        {2, 50, 1, 139, 81, 3.9},
                        {2, 54, 3.2, 85, 28, 3.8},
                        {1, 56, 2.9, 90, 153, 4}
                    };



    public prosesPeluang(){
            for (int i=0; i<dataMentah.length; ++i){
                if(dataMentah[i][1]>=1 && dataMentah[i][1]<=30){
                    if(dataMentah[i][2]>=0.1&& dataMentah[i][2]<=1.2){
                        if(dataMentah[i][3]>=44 && dataMentah[i][3]<=147){
                            if(dataMentah[i][4]>=8 && dataMentah[i][4]<=45){
                                if(dataMentah[i][5]>=3.5 && dataMentah[i][5]<=5.5){
                                    this.mnnnnt+=1;
                                    if(dataMentah[i][0]==2){
                                        this.mnnnnl+=1;
                                        this.totalHidup+=1;
                                        continue;
                                    }else{
                                        this.mnnnnd+=1;
                                        this.totalMati+=1;
                                        continue;
                                    }
                                }else{
                                    this.mnnntt+=1;
                                    if (dataMentah[i][0] == 2) {
                                        this.mnnntl += 1;
                                        this.totalHidup+=1;
                                        continue;
                                    } else {
                                        this.mnnntd += 1;
                                        this.totalMati+=1;
                                        continue;
                                    }
                                }

                            }else{
                                if (dataMentah[i][5] >= 3.5 && dataMentah[i][5] <= 5.5) {
                                    this.mnntnt += 1;
                                    if (dataMentah[i][0] == 2) {
                                        this.mnntnl += 1;
                                        this.totalHidup+=1;
                                        continue;
                                    } else {
                                        this.mnntnd += 1;
                                        this.totalMati+=1;
                                        continue;
                                    }
                                } else {
                                    this.mnnttt += 1;
                                    if (dataMentah[i][0] == 2) {
                                        this.mnnttl += 1;
                                        this.totalHidup+=1;
                                        continue;
                                    } else {
                                        this.mnnttd += 1;
                                        this.totalMati+=1;
                                        continue;
                                    }
                                }
                            }
                        }else{
                            if (dataMentah[i][4] >= 8 && dataMentah[i][4] <= 45) {
                                if (dataMentah[i][5] >= 3.5 && dataMentah[i][5] <= 5.5) {
                                    this.mntnnt += 1;
                                    if (dataMentah[i][0] == 2) {
                                        this.mntnnl += 1;
                                        this.totalHidup+=1;
                                        continue;
                                    } else {
                                        this.mntnnd += 1;
                                        this.totalMati+=1;
                                        continue;
                                    }
                                } else {
                                    this.mntntt += 1;
                                    if (dataMentah[i][0] == 2) {
                                        this.mntntl += 1;
                                        this.totalHidup+=1;
                                        continue;
                                    } else {
                                        this.mntntd += 1;
                                        this.totalMati+=1;
                                        continue;
                                    }
                                }

                            } else {
                                if (dataMentah[i][5] >= 3.5 && dataMentah[i][5] <= 5.5) {
                                    this.mnttnt += 1;
                                    if (dataMentah[i][0] == 2) {
                                        this.mnttnl += 1;
                                        this.totalHidup+=1;
                                        continue;
                                    } else {
                                        this.mnttnd += 1;
                                        this.totalMati+=1;
                                        continue;
                                    }
                                } else {
                                    this.mntttt += 1;
                                    if (dataMentah[i][0] == 2) {
                                        this.mntttl += 1;
                                        this.totalHidup+=1;
                                        continue;
                                    } else {
                                        this.mntttd += 1;
                                        this.totalMati+=1;
                                        continue;
                                    }
                                }
                            }
                        }
                    }else{
                        if (dataMentah[i][3] >= 44 && dataMentah[i][3] <= 147) {
                            if (dataMentah[i][4] >= 8 && dataMentah[i][4] <= 45) {
                                if (dataMentah[i][5] >= 3.5 && dataMentah[i][5] <= 5.5) {
                                    this.mtnnnt += 1;
                                    if (dataMentah[i][0] == 2) {
                                        this.mtnnnl += 1;
                                        this.totalHidup+=1;
                                        continue;
                                    } else {
                                        this.mtnnnd += 1;
                                        this.totalMati+=1;
                                        continue;
                                    }
                                } else {
                                    this.mtnntt += 1;
                                    if (dataMentah[i][0] == 2) {
                                        this.mtnntl += 1;
                                        this.totalHidup+=1;
                                        continue;
                                    } else {
                                        this.mtnntd += 1;
                                        this.totalMati+=1;
                                        continue;
                                    }
                                }

                            } else {
                                if (dataMentah[i][5] >= 3.5 && dataMentah[i][5] <= 5.5) {
                                    this.mntntt += 1;
                                    if (dataMentah[i][0] == 2) {
                                        this.mtntnl += 1;
                                        this.totalHidup+=1;
                                        continue;
                                    } else {
                                        this.mtntnd += 1;
                                        this.totalMati+=1;
                                        continue;
                                    }
                                } else {
                                    this.mtnttt += 1;
                                    if (dataMentah[i][0] == 2) {
                                        this.mtnttl += 1;
                                        this.totalHidup+=1;
                                        continue;
                                    } else {
                                        this.mtnttd += 1;
                                        this.totalMati+=1;
                                        continue;
                                    }
                                }
                            }
                        } else {
                            if (dataMentah[i][4] >= 8 && dataMentah[i][4] <= 45) {
                                if (dataMentah[i][5] >= 3.5 && dataMentah[i][5] <= 5.5) {
                                    this.mttnnt += 1;
                                    if (dataMentah[i][0] == 2) {
                                        this.mttnnl += 1;
                                        this.totalHidup+=1;
                                        continue;
                                    } else {
                                        this.mttnnd += 1;
                                        this.totalMati+=1;
                                        continue;
                                    }
                                } else {
                                    this.mttntt += 1;
                                    if (dataMentah[i][0] == 2) {
                                        this.mttntl += 1;
                                        this.totalHidup+=1;
                                        continue;
                                    } else {
                                        this.mttntd += 1;
                                        this.totalMati+=1;
                                        continue;
                                    }
                                }

                            } else {
                                if (dataMentah[i][5] >= 3.5 && dataMentah[i][5] <= 5.5) {
                                    this.mtttnt += 1;
                                    if (dataMentah[i][0] == 2) {
                                        this.mtttnl += 1;
                                        this.totalHidup+=1;
                                        continue;
                                    } else {
                                        this.mtttnd += 1;
                                        this.totalMati+=1;
                                        continue;
                                    }
                                } else {
                                    this.mttttt += 1;
                                    if (dataMentah[i][0] == 2) {
                                        this.mttttl += 1;
                                        this.totalHidup+=1;
                                        continue;
                                    } else {
                                        this.mttttd += 1;
                                        this.totalMati+=1;
                                        continue;
                                    }
                                }
                            }
                        }
                    }
                }else{
                    if (dataMentah[i][2] >= 0.1 && dataMentah[i][2] <= 1.2) {
                        if (dataMentah[i][3] >= 44 && dataMentah[i][3] <= 147) {
                            if (dataMentah[i][4] >= 8 && dataMentah[i][4] <= 45) {
                                if (dataMentah[i][5] >= 3.5 && dataMentah[i][5] <= 5.5) {
                                    this.tnnnnt += 1;
                                    if (dataMentah[i][0] == 2) {
                                        this.tnnnnl += 1;
                                        this.totalHidup+=1;
                                        continue;
                                    } else {
                                        this.tnnnnd += 1;
                                        this.totalMati=1;
                                        continue;
                                    }
                                } else {
                                    this.tnnntt += 1;
                                    if (dataMentah[i][0] == 2) {
                                        this.tnnntl += 1;
                                        this.totalHidup+=1;
                                        continue;
                                    } else {
                                        this.tnnntd += 1;
                                        this.totalMati+=1;
                                        continue;
                                    }
                                }

                            } else {
                                if (dataMentah[i][5] >= 3.5 && dataMentah[i][5] <= 5.5) {
                                    this.tnntnt += 1;
                                    if (dataMentah[i][0] == 2) {
                                        this.tnntnl += 1;
                                        this.totalHidup+=1;
                                        continue;
                                    } else {
                                        this.tnntnd += 1;
                                        this.totalMati+=1;
                                        continue;
                                    }
                                } else{
                                    this.tnnttt += 1;
                                    if (dataMentah[i][0] == 2) {
                                        this.tnnttl += 1;
                                        this.totalHidup+=1;
                                        continue;
                                    } else {
                                        this.tnnttd += 1;
                                        this.totalMati+=1;
                                        continue;
                                    }
                                }
                        
                            // komen sudah  
                        }
                        } else {
                            if (dataMentah[i][4] >= 8 && dataMentah[i][4] <= 45) {
                                if (dataMentah[i][5] >= 3.5 && dataMentah[i][5] <= 5.5) {
                                    this.tntnnt += 1;
                                    if (dataMentah[i][0] == 2) {
                                        this.tntnnl += 1;
                                        this.totalHidup += 1;
                                        continue;
                                    } else {
                                        this.tntnnd += 1;
                                        this.totalMati += 1;
                                        continue;
                                    }
                                } else {
                                    this.tntntt += 1;
                                    if (dataMentah[i][0] == 2) {
                                        this.tntntl += 1;
                                        this.totalHidup += 1;
                                        continue;
                                    } else {
                                        this.tntntd += 1;
                                        this.totalMati += 1;
                                        continue;
                                    }
                                }

                            } else {
                                if (dataMentah[i][5] >= 3.5 && dataMentah[i][5] <= 5.5) {
                                    this.tnttnt += 1;
                                    if (dataMentah[i][0] == 2) {
                                        this.tnttnl += 1;
                                        this.totalHidup += 1;
                                        continue;
                                    } else {
                                        this.tnttnd += 1;
                                        this.totalMati += 1;
                                        continue;
                                    }
                                } else {
                                    this.tntttt += 1;
                                    if (dataMentah[i][0] == 2) {
                                        this.tntttl += 1;
                                        this.totalHidup += 1;
                                        continue;
                                    } else {
                                        this.tntttd += 1;
                                        this.totalMati += 1;
                                        continue;
                                    }
                                }
                            }
                        }
                    } else {
                        if (dataMentah[i][3] >= 44 && dataMentah[i][3] <= 147) {
                            if (dataMentah[i][4] >= 8 && dataMentah[i][4] <= 45) {
                                if (dataMentah[i][5] >= 3.5 && dataMentah[i][5] <= 5.5) {
                                    this.ttnnnt += 1;
                                    if (dataMentah[i][0] == 2) {
                                        this.ttnnnl += 1;
                                        this.totalHidup += 1;
                                        continue;
                                    } else {
                                        this.ttnnnd += 1;
                                        this.totalMati += 1;
                                        continue;
                                    }
                                } else {
                                    this.ttnntt += 1;
                                    if (dataMentah[i][0] == 2) {
                                        this.ttnntl += 1;
                                        this.totalHidup += 1;
                                        continue;
                                    } else {
                                        this.ttnntd += 1;
                                        this.totalMati += 1;
                                        continue;
                                    }
                                }

                            } else {
                                if (dataMentah[i][5] >= 3.5 && dataMentah[i][5] <= 5.5) {
                                    this.ttntnt += 1;
                                    if (dataMentah[i][0] == 2) {
                                        this.ttntnl += 1;
                                        this.totalHidup += 1;
                                        continue;
                                    } else {
                                        this.ttntnd += 1;
                                        this.totalMati += 1;
                                        continue;
                                    }
                                } else {
                                    this.ttnttt += 1;
                                    if (dataMentah[i][0] == 2) {
                                        this.ttnttl += 1;
                                        this.totalHidup += 1;
                                        continue;
                                    } else {
                                        this.ttnttd += 1;
                                        this.totalMati += 1;
                                        continue;
                                    }
                                }
                            }
                        } else {
                            if (dataMentah[i][4] >= 8 && dataMentah[i][4] <= 45) {
                                if (dataMentah[i][5] >= 3.5 && dataMentah[i][5] <= 5.5) {
                                    this.tttnnt += 1;
                                    if (dataMentah[i][0] == 2) {
                                        this.tttnnl += 1;
                                        this.totalHidup += 1;
                                        continue;
                                    } else {
                                        this.tttnnd += 1;
                                        this.totalMati += 1;
                                        continue;
                                    }
                                } else {
                                    this.tttntt+=1;
                                    if (dataMentah[i][0] == 2) {
                                        this.tttntl += 1;
                                        this.totalHidup += 1;
                                        continue;
                                    } else {
                                        this.tttntd += 1;
                                        this.totalMati += 1;
                                        continue;
                                    }
                                }

                            } else {
                                if (dataMentah[i][5] >= 3.5 && dataMentah[i][5] <= 5.5) {
                                    this.ttttnt += 1;
                                    if (dataMentah[i][0] == 2) {
                                        this.ttttnl += 1;
                                        this.totalHidup+=1;
                                        continue;
                                    } else {
                                        this.ttttnd += 1;
                                        this.totalMati += 1;
                                        continue;
                                    }
                                } else { 
                                    this.tttttt+=1;
                                    if (dataMentah[i][0] == 2) {
                                        this.tttttl += 1;
                                        this.totalHidup += 1;
                                        continue;
                                    } else {
                                        this.tttttd += 1;
                                        this.totalMati += 1;
                                        continue;
                                    }
                                }
                            }
                        }
                    }
                }
            }
            //end loop
            
            //probabilitas
            //kuning
            jumlahTotal= totalHidup+totalMati;
            mnnnnd = mnnnnd/(jumlahTotal);
            mnnnnl = mnnnnl/(jumlahTotal);
            mnnntd = mnnntd/(jumlahTotal);
            mnnntl = mnnntl/(jumlahTotal);
            mnntnd = mnntnd/(jumlahTotal);
            mnntnl = mnntnl/(jumlahTotal);
            mnnttd = mnnttd/(jumlahTotal);
            mnnttl = mnnttl/(jumlahTotal);
            mntnnd = mntnnd/(jumlahTotal);
            mntnnl = mntnnl/(jumlahTotal);
            mntntd = mntntd/(jumlahTotal);
            mntntl = mntntl/(jumlahTotal);
            mnttnd = mnttnd/(jumlahTotal);
            mnttnl = mnttnl/(jumlahTotal);
            mntttd = mntttd/(jumlahTotal);
            mntttl = mntttl/(jumlahTotal);
            mtnnnd = mtnnnd/(jumlahTotal);
            mtnnnl = mtnnnl/(jumlahTotal);
            mtnntd = mtnntd/(jumlahTotal);
            mtnntl = mtnntl/(jumlahTotal);

            //merah
            mtntnd = mtntnd/(jumlahTotal); 
            mtntnl = mtntnl/(jumlahTotal);  
            mtnttd = mtnttd/(jumlahTotal);
            mtnttl = mtnttl/(jumlahTotal); 
            mttnnd = mttnnd/(jumlahTotal); 
            mttnnl = mttnnl/(jumlahTotal); 
            mttntd = mttntd/(jumlahTotal); 
            mttntl = mttntl/(jumlahTotal); 
            mtttnd = mtttnd/(jumlahTotal); 
            mtttnl = mtttnl/(jumlahTotal); 
            mttttd = mttttd/(jumlahTotal);
            mttttl = mttttl/(jumlahTotal); 
            tnnnnd = tnnnnd/(jumlahTotal);
            tnnnnl = tnnnnl/(jumlahTotal); 
            tnnntd = tnnntd/(jumlahTotal);
            tnnntl = tnnntl/(jumlahTotal); 
            tnntnd = tnntnd/(jumlahTotal);
            tnntnl = tnntnl/(jumlahTotal); 
            tnnttd = tnnttd/(jumlahTotal);
            tnnttl = tnnttl/(jumlahTotal); 
            tntnnd = tntnnd/(jumlahTotal);
            tntnnl = tntnnl/(jumlahTotal); 
            
            //biru
            tntntd = tntntd/(jumlahTotal);
            tntntl = tntntl/(jumlahTotal);
            tnttnd = tnttnd/(jumlahTotal);
            tnttnl = tnttnl/(jumlahTotal);
            tntttd = tntttd/(jumlahTotal);
            tntttl = tntttl/(jumlahTotal);
            ttnnnd = ttnnnd/(jumlahTotal);
            ttnnnl = ttnnnl/(jumlahTotal);
            ttnntd = ttnntd/(jumlahTotal);
            ttnntl = ttnntl/(jumlahTotal);
            ttntnd = ttntnd/(jumlahTotal);
            ttntnl = ttntnl/(jumlahTotal);
            ttnttd = ttnttd/(jumlahTotal);
            ttnttl = ttnttl/(jumlahTotal);
            tttnnd = tttnnd/(jumlahTotal);
            tttnnl = tttnnl/(jumlahTotal);
            tttntd = tttntd/(jumlahTotal);
            tttntl = tttntl/(jumlahTotal);
            ttttnd = ttttnd/(jumlahTotal);
            ttttnl = ttttnl/(jumlahTotal);
            tttttd = tttttd/(jumlahTotal);
            tttttl = tttttl/(jumlahTotal);
            totalHidup = totalHidup/(jumlahTotal);
            totalMati = totalMati/(jumlahTotal);
            
            //hitung pembagi 
            
            
                pembagi = (mnnnnd*totalMati)+(mnnnnl*totalHidup)+
                            (mnnntd*totalMati)+(mnnntl*totalHidup)+
                            (mnntnd*totalMati)+(mnntnl*totalHidup)+
                            (mnnttd*totalMati)+(mnnttl*totalHidup)+
                            (mntnnd*totalMati)+(mntnnl*totalHidup)+
                            (mntntd*totalMati)+(mntntl*totalHidup)+
                            (mnttnd*totalMati)+(mnttnl*totalHidup)+
                            (mntttd*totalMati)+(mntttl*totalHidup)+
                            (mtnnnd*totalMati)+(mtnnnl*totalHidup)+
                            (mtnntd*totalMati)+(mtnntl*totalHidup)+
                            (mtntnd*totalMati)+(mtntnl*totalHidup)+
                            (mtnttd*totalMati)+(mtnttl*totalHidup)+
                            (mttnnd*totalMati)+(mttnnl*totalHidup)+
                            (mttntd*totalMati)+(mttntl*totalHidup)+
                            (mtttnd*totalMati)+(mtttnl*totalHidup)+
                            (mttttd*totalMati)+(mttttl*totalHidup)+
                            (tnnnnd*totalMati)+(tnnnnl*totalHidup)+
                            (tnnntd*totalMati)+(tnnntl*totalHidup)+
                            (tnntnd*totalMati)+(tnntnl*totalHidup)+
                            (tnnttd*totalMati)+(tnnttl*totalHidup)+
                            (tntnnd*totalMati)+(tntnnl*totalHidup)+
                            (tntntd*totalMati)+(tntntl*totalHidup)+
                            (tnttnd*totalMati)+(tnttnl*totalHidup)+
                            (tntttd*totalMati)+(tntttl*totalHidup)+
                            (ttnnnd*totalMati)+(ttnnnl*totalHidup)+
                            (ttnntd*totalMati)+(ttnntl*totalHidup)+
                            (ttntnd*totalMati)+(ttntnl*totalHidup)+
                            (ttnttd*totalMati)+(ttnttl*totalHidup)+
                            (tttnnd*totalMati)+(tttnnl*totalHidup)+
                            (tttntd*totalMati)+(tttntl*totalHidup)+
                            (ttttnd*totalMati)+(ttttnl*totalHidup)+
                            (tttttd*totalMati)+(tttttl*totalHidup);
        
            
            
            //hitungBayes
            //kuning
            this.mnnnnd = (mnnnnd*totalMati)/pembagi;
            this.mnnnnl = (mnnnnl*totalHidup)/pembagi;
            this.mnnntd = (mnnntd*totalMati)/pembagi;
            this.mnnntl = (mnnntl*totalHidup)/pembagi;
            this.mnntnd = (mnntnd*totalMati)/pembagi;
            this.mnntnl = (mnntnl*totalHidup)/pembagi;
            this.mnnttd = (mnnttd*totalMati)/pembagi;
            this.mnnttl = (mnnttl*totalHidup)/pembagi;
            this.mntnnd = (mntnnd*totalMati)/pembagi;
            this.mntnnl = (mntnnl*totalHidup)/pembagi;
            this.mntntd = (mntntd*totalMati)/pembagi;
            this.mntntl = (mntntl*totalHidup)/pembagi;
            this.mnttnd = (mnttnd*totalMati)/pembagi;
            this.mnttnl = (mnttnl*totalHidup)/pembagi;
            this.mntttd = (mntttd*totalMati)/pembagi;
            this.mntttl = (mntttl*totalHidup)/pembagi;
            this.mtnnnd = (mtnnnd*totalMati)/pembagi;
            this.mtnnnl = (mtnnnl*totalHidup)/pembagi;
            this.mtnntd = (mtnntd*totalMati)/pembagi;
            this.mtnntl = (mtnntl*totalHidup)/pembagi;
            
            //merah
            this.mtntnd = (mtntnd*totalMati)/pembagi;
            this.mtntnl = (mtntnl*totalHidup)/pembagi;
            this.mtnttd = (mtnttd*totalMati)/pembagi;
            this.mtnttl = (mtnttl*totalHidup)/pembagi;
            this.mttnnd = (mttnnd*totalMati)/pembagi;
            this.mttnnl = (mttnnl*totalHidup)/pembagi;
            this.mttntd = (mttntd*totalMati)/pembagi;
            this.mttntl = (mttntl*totalHidup)/pembagi;
            this.mtttnd = (mtttnd*totalMati)/pembagi;
            this.mtttnl = (mtttnl*totalHidup)/pembagi;
            this.mttttd = (mttttd*totalMati)/pembagi;
            this.mttttl = (mttttl*totalHidup)/pembagi;
            this.tnnnnd = (tnnnnd*totalMati)/pembagi;
            this.tnnnnl = (tnnnnl*totalHidup)/pembagi;
            this.tnnntd = (tnnntd*totalMati)/pembagi;
            this.tnnntl = (tnnntl*totalHidup)/pembagi; 
            this.tnntnd = (tnntnd*totalMati)/pembagi; 
            this.tnntnl = (tnntnl*totalHidup)/pembagi; 
            this.tnnttd = (tnnttd*totalMati)/pembagi;
            this.tnnttl = (tnnttl*totalHidup)/pembagi; 
            this.tntnnd = (tntnnd*totalMati)/pembagi; 
            this.tntnnl = (tntnnl*totalHidup)/pembagi; 
            
        
            this.tntntd = (tntntd*totalMati)/pembagi;
            this.tntntl = (tntntl*totalHidup)/pembagi;
            this.tnttnd = (tnttnd*totalMati)/pembagi;
            this.tnttnl = (tnttnl*totalHidup)/pembagi;
            this.tntttd = (tntttd*totalMati)/pembagi;
            this.tntttl = (tntttl*totalHidup)/pembagi;
            this.ttnnnd = (ttnnnd*totalMati)/pembagi;
            this.ttnnnl = (ttnnnl*totalHidup)/pembagi;
            this.ttnntd = (ttnntd*totalMati)/pembagi;
            this.ttnntl = (ttnntl*totalHidup)/pembagi;
            this.ttntnd = (ttntnd*totalMati)/pembagi;
            this.ttntnl = (ttntnl*totalHidup)/pembagi;
            this.ttnttd = (ttnttd*totalMati)/pembagi;
            this.ttnttl = (ttnttl*totalHidup)/pembagi;
            this.tttnnd = (tttnnd*totalMati)/pembagi;
            this.tttnnl = (tttnnl*totalHidup)/pembagi;
            this.tttntd = (tttntd*totalMati)/pembagi;
            this.tttntl = (tttntl*totalHidup)/pembagi;
            this.ttttnd = (ttttnd*totalMati)/pembagi;
            this.ttttnl = (ttttnl*totalHidup)/pembagi;
            this.tttttd = (tttttd*totalMati)/pembagi;
            this.tttttl = (tttttl*totalHidup)/pembagi; 
            
            
    }

        //bayes
    public void setPeluang(double usia, double bilirubin, double alkFosfat, double sgot, double albumin ){ //enkapsulasi (atribut peluangHidup dan peluangMati) 
                            // dan override (method setPeluang dari interface proses)
        
        //COBA
        if(usia>=1 && usia<=30){
                    if(bilirubin>=0.1&& bilirubin<=1.2){
                        if(alkFosfat>=44 && alkFosfat<=147){
                            if(sgot>=8 && sgot<=45){
                                if(albumin>=3.5 && albumin<=5.5){
                                    this.peluangHidup = this.mnnnnl;  
                                    this.peluangMati = this.mnnnnd;   
                                }else{
                                    this.peluangHidup = this.mnnntl;
                                    this.peluangMati = this.mnnntd;
                                }

                            }else{
                                if (albumin >= 3.5 && albumin <= 5.5) {
                                    this.peluangHidup = this.mnntnl;
                                    this.peluangMati = this.mnntnd;
                                } else {
                                    this.peluangHidup= this.mnnttl;
                                    this.peluangMati= this.mnnttd;
                                }
                            }
                        }else{
                            if (sgot >= 8 && sgot <= 45) {
                                if (albumin >= 3.5 && albumin <= 5.5) {
                                    this.peluangHidup=this.mntnnl;
                                    this.peluangMati=this.mntnnd;
                                } else {
                                        this.peluangHidup=this.mntntl;
                                        this.peluangMati=this.mntntd;
                                }

                            } else {
                                if (albumin >= 3.5 && albumin <= 5.5) {
                                    this.peluangHidup = this.mnttnl;
                                    this.peluangMati = this.mnttnd;
                                } else {
                                    this.peluangHidup = this.mntttl;
                                    this.peluangMati = this.mntttd;
                                }
                            }
                        }
                    }else{
                        if (alkFosfat >= 44 && alkFosfat <= 147) {
                            if (sgot >= 8 && sgot <= 45) {
                                if (albumin >= 3.5 && albumin <= 5.5) {
                                    this.peluangHidup = this.mtnnnl;
                                    this.peluangMati = this.mtnnnd;
                                } else {
                                    this.peluangHidup = this.mtnntl;
                                    this.peluangMati =  this.mtnntd;
                                        
                                }

                            } else {
                                if (albumin >= 3.5 && albumin <= 5.5) {
                                    this.peluangHidup = this.mtntnl;
                                    this.peluangMati = this.mtntnd;
                                } else {
                                    this.peluangHidup = this.mtnttl;
                                    this.peluangMati = this.mtnttd;
                                    }
                            }
                        } else {
                            if (sgot >= 8 && sgot <= 45) {
                                if (albumin >= 3.5 && albumin <= 5.5) {
                                    this.peluangHidup = this.mttnnl;
                                    this.peluangMati =this.mttnnd;
                                } else {
                                    this.peluangHidup = this.mttntl;
                                    this.peluangMati =this.mttntd;
                                    }

                            } else {
                                if (albumin >= 3.5 && albumin <= 5.5) {
                                    this.peluangHidup = this.mtttnl;
                                    this.peluangMati =this.mtttnd;
                                } else {
                                    this.peluangHidup = this.mttttl;
                                    this.peluangMati =this.mttttd;
                                    }
                            }
                        }
                    }
                }else{
                    if (bilirubin >= 0.1 && bilirubin <= 1.2) {
                        if (alkFosfat >= 44 && alkFosfat <= 147) {
                            if (sgot >= 8 && sgot <= 45) {
                                if (albumin >= 3.5 && albumin <= 5.5) {
                                    this.peluangHidup = this.tnnnnl;
                                    this.peluangMati = this.tnnnnd;
                                } else {
                                    this.peluangHidup = this.tnnntl;
                                    this.peluangMati =this.tnnntd;
                                }

                            } else {
                                if (albumin >= 3.5 && albumin <= 5.5) {
                                    this.peluangHidup = this.tnntnl;
                                    this.peluangMati =this.tnntnd;
                                } else{                                    
                                    this.peluangHidup=this.tnnttl;
                                    this.peluangMati=this.tnnttd;                                
                                }
                        
                            }
                            // komen sudah  
                        } else {
                            if (sgot >= 8 && sgot <= 45) {
                                if (albumin >= 3.5 && albumin <= 5.5) {                                    
                                    this.peluangHidup=this.tntnnl;                                    
                                    this.peluangMati=this.tntnnd;                                
                            } else {                                    
                                this.peluangHidup=this.tntntl;                                    
                                this.peluangMati=this.tntntd;                                
                            }

                            } else {
                                if (albumin >= 3.5 && albumin <= 5.5) {                                    
                                    this.peluangHidup= this.tnttnl;                                    
                                    this.peluangMati= this.tnttnd;                                
                                } else {                                    
                                    this.peluangHidup= this.tntttl;                                    
                                    this.peluangMati= this.tntttd;                                
                                }
                            }
                        }
                    } else {
                        if (alkFosfat >= 44 && alkFosfat <= 147) {
                            if (sgot >= 8 && sgot <= 45) {
                                if (albumin >= 3.5 && albumin <= 5.5) {
                                    this.peluangHidup= this.ttnnnl;
                                    this.peluangMati= this.ttnnnd;
                                } else {
                                    this.peluangHidup=this.ttnntl;
                                    this.peluangMati=this.ttnntd;
                                }

                            } else {
                                if (albumin >= 3.5 && albumin <= 5.5) {
                                    this.peluangHidup= this.ttntnl;
                                    this.peluangMati=this.ttntnd;
                                } else {
                                    this.peluangHidup=this.ttnttl ;
                                    this.peluangMati=this.ttnttd ;
                                }
                            }
                        } else {
                            if (sgot >= 8 && sgot <= 45) {
                                if (albumin >= 3.5 && albumin <= 5.5) {
                                    this.peluangHidup= this.tttnnl ;
                                    this.peluangMati= this.tttnnd;
                                } else {
                                    this.peluangHidup= this.tttntl;
                                    this.peluangMati= this.tttntd;
                                }

                            } else {
                                if (albumin >= 3.5 && albumin <= 5.5) {
                                    this.peluangHidup=this.ttttnl;
                                    this.peluangMati=this.ttttnd;
                                } else { 
                                    this.peluangHidup=this.tttttl;
                                    this.peluangMati=this.tttttd;
                                }
                            }
                        }
                    }
                }
    } 
    
    public double getPeluangHidup(){ //  enkapsulasi (atribut peluangHidup)  
                                      // dan override (method getPeluangHidup dari interface proses)
     return peluangHidup;
    }
     
    public double getPeluangMati() {// enkapsulasi (atribut peluangMati) 
                                     // dan override (method getPeluangMati dari interface proses)
        return peluangMati;
    }

    
}
