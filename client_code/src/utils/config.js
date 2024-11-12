const config = {
    get() {
        return {
            url : process.env.VUE_APP_BASE_API_URL + process.env.VUE_APP_BASE_API + '/',
            name: process.env.VUE_APP_BASE_API,
			menuList:[
				{
					name: '系统公告',
					icon: 'icon-common7',
					child:[
						{
							name:'系统公告',
							url:'/index/newsList'
						},
					]
				},
				{
					name: '论坛交流',
					icon: 'icon-common15',
					child:[
						{
							name:'论坛交流',
							url:'/index/forumList'
						},
					]
				},
				{
					name: '健身知识',
					icon: 'icon-common45',
					child:[
						{
							name:'健身知识',
							url:'/index/jianshenzhishiList'
						},
					]
				},
				{
					name: '健身器材',
					icon: 'icon-common31',
					child:[
						{
							name:'健身器材',
							url:'/index/jianshenqicaiList'
						},
					]
				},
				{
					name: '健身教练',
					icon: 'icon-common47',
					child:[
						{
							name:'健身教练',
							url:'/index/jianshenjiaolianList'
						},
					]
				},
				{
					name: '健身课程',
					icon: 'icon-common8',
					child:[
						{
							name:'健身课程',
							url:'/index/jianshenkechengList'
						},
					]
				},
			]
        }
    },
    getProjectName(){
        return {
            projectName: "基于springboot的健身房管理系统"
        } 
    }
}
export default config
